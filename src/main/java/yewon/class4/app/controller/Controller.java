package yewon.class4.app.controller;

import yewon.class4.app.Service.RecommendFriendService;
import yewon.class4.app.Service.StringParseService;
import yewon.class4.app.domain.User;
import yewon.class4.app.domain.UserList;
import yewon.class4.app.io.InputHandlerImpl;
import yewon.class4.app.io.OutputHandlerImpl;
import yewon.class4.app.common.ParserImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static yewon.class4.app.common.ValueBounds.*;

public class Controller {

    private boolean hasVisitors; // 방문자목록이 주어졌는가?
    private final UserList users;
    private final InputHandlerImpl input;
    private final OutputHandlerImpl<String> output;
    private final RecommendFriendService pointManager;
    private final StringParseService parser;

    public Controller() {
        hasVisitors = true;
        users = new UserList();
        input = new InputHandlerImpl();
        output = new OutputHandlerImpl<>();
        pointManager = new RecommendFriendService();
        parser = new StringParseService();
    }

    public void solution() {

        // 정보 입력받기
        String userName = inputInfo(INPUT_USER_NAME);
        String inputFriends = inputInfo(INPUT_FRIENDS_LIST);
        String inputVisitors = inputInfo(INPUT_VISITORS_LIST);

        // 사용자, 유저 리스트 생성
        User user = new User(userName, new LinkedList<>(), new LinkedList<>());
        users.addUser(user);

        // 친구 목록 생성
        String[][] friends = parser.friendsParsing(inputFriends);

        // 방문자 목록이 주어졌는지 검사
        if (inputVisitors == null || inputVisitors.length() == 0) {
            hasVisitors = false;
        }

        // 방문자목록 파싱
        if (hasVisitors) {
            String[] visitors = parser.visitorsParsing(inputVisitors);
            addVisitorsToUser(user, users, visitors);
        }

        // 아이디A의 친구목록에 아이디B 추가, 아이디B의 친구목록에 아이디A 추가
        for (String[] friend : friends) {
            User friendA = null;
            User friendB = null;
            for (int i = 0; i < users.size(); i++) {
                String existName = users.get(i).getName();
                if (existName.equals(friend[0])) {
                    friendA = users.get(i);
                    users.remove(i);
                    break;
                }
                friendA = new User(friend[0], new LinkedList<>(), new LinkedList<>());
            }
            for (int i = 0; i < users.size(); i++) {
                String existName = users.get(i).getName();
                if (existName.equals(friend[1])) {
                    friendB = users.get(i);
                    users.remove(i);
                    break;
                }
                friendB = new User(friend[1], new LinkedList<>(), new LinkedList<>());
            }
            friendA.addFriend(friendB);
            friendB.addFriend(friendA);
            users.add(friendA);
            users.add(friendB);
        }

        // 방문자 추가
        if (hasVisitors) {
            for (String visitor : visitors) {
                User newVisitor = null;
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getName().equals(visitor)) {
                        newVisitor = users.get(i);
                        users.remove(i);
                        break;
                    }
                    newVisitor = new User(visitor, new LinkedList<>(), new LinkedList<>());
                }
                user.addVisitor(newVisitor);
                users.add(newVisitor);
            }
        }


        List<User> top5User = pointManager.recommendFriends(user, users);

        if (top5User == null) {
            output.message("❌ 추천할 친구가 없습니다.");
            return;
        }

        output.result(top5User);
    }

    private void addVisitorsToUser(User user, List<User> users, String[] visitors) {
        for (String visitor : visitors) {
            User newVisitor = findOrCreateUser(users, visitor);
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getName().equals(visitor)) {
                    newVisitor = users.get(i);
                    users.remove(i);
                    break;
                }
                newVisitor = new User(visitor, new LinkedList<>(), new LinkedList<>());
            }
            user.addVisitor(newVisitor);
            users.add(newVisitor);
        }
    }

    private User findOrCreateUser(List<User> users, String usersName) {
        for (User user : users) {
            if (user.getName().equals(usersName)) {
                return user;
            }
        }
        return new User(usersName, new LinkedList<>(), new LinkedList<>());
    }

    private String inputInfo(String message) {
        output.message(message);
        return input.input();
    }

}
