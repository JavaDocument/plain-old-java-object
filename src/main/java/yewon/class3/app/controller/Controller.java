package yewon.class3.app.controller;

import yewon.class3.app.io.OutputHandlerImpl;
import yewon.class3.app.service.NumberComparator;
import yewon.class3.app.user.Player;

import java.util.*;

public class Controller {


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
        output.showResult(winner);
    }

    private void selectPagesForPlayers(List<Player> players) {
        for (Player player : players) {
            player.getBook().open();
        }
    }

    private void setMaxNumbersForPlayers(List<Player> players) {
        for (Player player : players) {
            int maxNumber = comparator.getLargest(player.getBook());
            player.setMaxNumber(maxNumber);
        }
    }





}
