package yewon.class4.app.controller;

import yewon.class4.app.Service.RecommendFriendService;
import yewon.class4.app.entity.User;
import yewon.class4.app.io.InputHandlerImpl;
import yewon.class4.app.io.OutputHandlerImpl;
import yewon.class4.app.common.ParserImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static yewon.class4.app.common.ValueBounds.*;

public class Controller {

    private boolean hasVisitors; // 방문자목록이 주어졌는가?
    private final InputHandlerImpl input;
    private final OutputHandlerImpl<String> output;
    private final ParserImpl parser;
    private final RecommendFriendService pointManager;

    public Controller() {
        input = new InputHandlerImpl();
        output = new OutputHandlerImpl<>();
        parser = new ParserImpl();
        hasVisitors = true;
        pointManager = new RecommendFriendService();
    }

    // TODO : 리팩터링, 로직은 서비스로 이동
    public void solution() {

        // 정보 입력받기
        String userName = inputInfo(INPUT_USER_NAME);
        String inputFriends = inputInfo(INPUT_FRIENDS_LIST);
        String inputVisitors = inputInfo(INPUT_VISITORS_LIST);

        if (inputVisitors == null || inputVisitors.length() == 0) {
            hasVisitors = false;
        }

        // 사용자, 유저 리스트 생성
        User user = new User(userName, new LinkedList<>(), new LinkedList<>());
        List<User> users = new ArrayList<>();
        users.add(user);
//        UserList.of().addUser(user);

        // 파싱
        // 친구목록 파싱 - 바깥 [[, ]], " 제거 후 '], [' 를 기준으로 나눈다.
        String element = inputFriends.substring(2, inputFriends.length() - 2);
        String[] rowFriends = parser.removeQuotes(element).split("\\], \\[");
        String[][] friends = new String[rowFriends.length][2];
        for (int i = 0; i < rowFriends.length; i++) {
            friends[i] = rowFriends[i].split(", ");
        }

        // 방문자목록 파싱
        // visitors[0] = bedi
        String[] visitors = null;
        if (hasVisitors) {
            visitors = parser.removeAllSymbols(inputVisitors).split(", ");
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

    private String inputInfo(String message) {
        output.message(message);
        return input.input();
    }

}
