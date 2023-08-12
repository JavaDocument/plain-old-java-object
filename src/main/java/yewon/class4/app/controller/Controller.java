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
    private UserList users;
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
        User user = users.findOrCreateUser(userName);
        users.addUser(user);

        // 방문자 목록이 주어졌다면, 방문자목록 파싱 및 유저의 방문자목록에 추가
        if (inputVisitors != null && inputVisitors.length() != 0) {
            String[] visitors = parser.visitorsParsing(inputVisitors);
            users.addVisitorsToUser(user, visitors);
        }

        // 친구 목록 파싱해서 이차원배열로 만들기
        String[][] friends = parser.friendsParsing(inputFriends);

        // 아이디 A의 친구목록에 아이디 B 추가, 아이디 B의 친구목록에 아이디 A 추가
        users.addFriends(friends);

        // 추천친구 5명 선정 및 출력
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
