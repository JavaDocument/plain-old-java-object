package yewon.class4.app.controller;

import yewon.class4.app.entity.User;
import yewon.class4.app.io.InputHandlerImpl;
import yewon.class4.app.io.OutputHandlerImpl;
import yewon.class4.app.common.ParserImpl;
import yewon.class4.app.validation.ValidatorImpl;

import java.util.Arrays;
import java.util.List;

public class Controller {

    private final String INPUT_USER_NAME = "👩 회원의 이름을 입력하세요 : ";
    private final String INPUT_FRIENDS_LIST = "👩‍👧‍👦 친구 목록을 입력하세요 : ";
    private final String INPUT_VISITORS_LIST = "🐾 방문자 목록을 입력하세요 : ";
    private final InputHandlerImpl input;
    private final OutputHandlerImpl<String> output;
    private final ParserImpl parse;
    private final ValidatorImpl validator;

    public Controller() {
        input = new InputHandlerImpl();
        output = new OutputHandlerImpl<>();
        parse = new ParserImpl();
        validator = new ValidatorImpl();
    }

    public void solution() {
        // 정보 입력받기
        String userName = inputInfo(INPUT_USER_NAME);
        String inputFriends = inputInfo(INPUT_FRIENDS_LIST);
        String inputVisitors = inputInfo(INPUT_VISITORS_LIST);

        // 파싱
        // 친구목록 파싱 - 바깥 [[, ]], " 제거 후 '], [' 를 기준으로 나눈다.
        String element = inputFriends.substring(2, inputFriends.length() - 2);
        String[] rowFriends = parse.removeQuotes(element).split("\\], \\[");
        String[][] friends = new String[rowFriends.length][2];
        for (int i = 0; i < rowFriends.length; i++) {
            friends[i] = rowFriends[i].split(", ");
        }

        // 방문자목록 파싱
        // visitors[0] = bedi
        String[] visitors = parse.removeAllSymbols(inputVisitors).split(",");

        // 예외검사

        // User 객체 생성


    }

    private String inputInfo(String message) {
        output.message(message);
        return input.input();
    }


}
