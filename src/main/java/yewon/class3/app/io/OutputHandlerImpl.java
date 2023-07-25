package yewon.class3.app.io;

import yewon.class3.app.user.Player;

import java.util.Arrays;
import java.util.List;

public class OutputHandlerImpl implements OutputHandler {

    @Override
    public void message(int result) {
        System.out.println(result);
    }

    @Override
    public void message(String result) {
        System.out.println(result);
    }

    @Override
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

    @Override
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
