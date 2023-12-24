package sum.class3.app.user;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
    static List<Integer> gameResults = new ArrayList<>();

    public static void addGameResult(int winner) {
        gameResults.add(winner);
    }

    public static void showGameResult() {
        System.out.println("게임 결과: " + gameResults);
    }

}
