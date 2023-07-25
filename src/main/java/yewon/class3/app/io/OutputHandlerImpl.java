package yewon.class3.app.io;

import yewon.class3.app.user.Player;

import java.util.Arrays;
import java.util.List;

public class OutputHandlerImpl implements OutputHandler {

    // Result
    private final int POBI_WIN = 1;
    private final int CRONG_WIN = 2;
    private final int DRAW = 0;

    @Override
    public void message(int result) {
        System.out.println(result);
    }

    @Override
    public void message(String result) {
        System.out.println(result);
    }

    // 결과 출력
    public void showResult(Player winner) {
        if (winner.getName().equals("pobi")) {
            message(POBI_WIN);
            return;
        }
        if (winner.getName().equals("crong")){
            message(CRONG_WIN);
            return;
        }
        message(DRAW);
    }

    public void showSelectedPages(List<Player> players) {
        for (Player player : players) {
            message("📖 "
                    + player.getName()
                    + "가 뽑은 건... "
                    + Arrays.toString(
                            player.getBook().getSelectedPage()
                    )
            );
        }
    }

    public void showMaxNumbers(List<Player> players) {
        for (Player player : players) {
            message("✅ "
                    + player.getName()
                    + "의 가장 큰 수는... "
                    + player.getMaxNumber()
            );
        }
    }
}
