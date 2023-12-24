package lkdcode.class3.app.domain.controller;

import lkdcode.class3.app.domain.member.Player;

public class Game {

    private final Player firstPlayer;
    private final Player secondPlayer;
    private final int POBI_WIN = 1;
    private final int CRONG_WIN = 2;
    private final int DRAW = 2;

    public static Game newInstance(Player pobi, Player crong) {
        return new Game(pobi, crong);
    }

    private Game(Player pobi, Player crong) {
        this.firstPlayer = pobi;
        this.secondPlayer = crong;
    }

    public void gameStart() {
        int pobiNumber = firstPlayer.getPlayerNumber();
        int crongNumber = secondPlayer.getPlayerNumber();

        resultPrint(pobiNumber, crongNumber);
    }

    private void resultPrint(int pobiNumber, int crongNumber) {
        if (pobiNumber > crongNumber) {
            System.out.println(POBI_WIN);
            return;
        }

        if (pobiNumber < crongNumber) {
            System.out.println(CRONG_WIN);
            return;
        }

        System.out.println(DRAW);
    }

}
