package yewon.class3.app.controller;

import yewon.class3.app.io.OutputHandlerImpl;
import yewon.class3.app.service.NumberComparator;
import yewon.class3.app.user.Player;

import java.util.*;

public class Controller {

    // Result
    private final int POBI_WIN = 1;
    private final int CRONG_WIN = 2;
    private final int DRAW = 0;
    private List<Player> players;
    private final NumberComparator comparator;
    private final OutputHandlerImpl output;

    public Controller() {
        comparator = new NumberComparator();
        output = new OutputHandlerImpl();
    }

    public void solution(List<Player> players) {
        selectPagesForPlayers(players);
        output.showSelectedPages(players);
        setMaxNumbersForPlayers(players);
        output.showMaxNumbers(players);
        Player winner = comparator.getWinner(players);
        showResult(winner);
    }

    private void selectPagesForPlayers(List<Player> players) {
        for (Player player : players) {
            player.getBook().open();
        }
    }

    private void setMaxNumbersForPlayers(List<Player> players) {
        for (Player player : players) {
            int maxNumber = comparator.getLargest(player);
            player.setMaxNumber(maxNumber);
        }
    }

    // 결과 출력
    private void showResult(Player winner) {
        if (winner.getName().equals("pobi")) {
            output.message(POBI_WIN);
            return;
        }
        if (winner.getName().equals("crong")){
            output.message(CRONG_WIN);
            return;
        }
        output.message(DRAW);
    }



}
