package yewon.class3.app.service;

import yewon.class3.app.book.Book;
import yewon.class3.app.common.ParserImpl;
import yewon.class3.app.user.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberComparator {

    private final ParserImpl parse;

    public NumberComparator() {
        parse = new ParserImpl();
    }

    public Player getWinner(List<Player> players) {
        Player winner = players.get(0);
        int maxNumber = winner.getMaxNumber();
        for (int i = 1; i < players.size(); i++) {
            Player otherPlayer = players.get(i);
            int comparingNumber = otherPlayer.getMaxNumber();
            if (comparingNumber > maxNumber) {
                winner = otherPlayer;
                maxNumber = comparingNumber;
            }
        }
        return winner;
    }

    public int getLargest(Book book) {
        String[] selectedPages = book.getSelectedPage();
        List<Integer> calcResultList = getCalcResultList(selectedPages);
        int maxNumber = Collections.max(calcResultList);
        return maxNumber;
    }

    private List<Integer> getCalcResultList(String[] selectedPages) {
        List<Integer> calcResultList = new ArrayList<>();
        for (String page : selectedPages) {
            calcResultList.add(getSumDigits(page));
            calcResultList.add(getMultiplyDigits(page));
        }
        return calcResultList;
    }

    private int getSumDigits(String page) {
        int result = 0;
        for (int i = 0; i < page.length(); i++) {
            result += parse.integer(page.charAt(i));
        }
        return result;
    }

    private int getMultiplyDigits(String page) {
        int result = 1;
        for (int i = 0; i < page.length(); i++) {
            result *= parse.integer(page.charAt(i));
        }
        return result;
    }

}
