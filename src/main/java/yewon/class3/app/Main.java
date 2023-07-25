package yewon.class3.app;

import yewon.class3.app.controller.Controller;
import yewon.class3.app.user.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        // 플레이어 추가
        players.add(new Player("pobi"));
        players.add(new Player("crong"));
        
        // 실행
        new Controller().solution(players);
    }
}
