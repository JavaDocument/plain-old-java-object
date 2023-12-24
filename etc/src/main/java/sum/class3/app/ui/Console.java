package sum.class3.app.ui;


import sum.class3.app.user.GameResult;
import sum.class3.app.user.User;
import sum.class3.app.util.WinnerUtil;

public class Console {

    private User pobi;
    private User crong;

    public Console() {
        this.pobi = new User("포비");
        this.crong = new User("크롱");
    }

    public void gameStart() {

        pobi.openBook();
        int pobiMaxNumber = pobi.calculateMax();

        crong.openBook();
        int crongMaxNumber = crong.calculateMax();

        WinnerUtil winnerUtil = new WinnerUtil();
        int winner = winnerUtil.showWinner(pobiMaxNumber, crongMaxNumber);

        GameResult.addGameResult(winner);

    }


    public void gameResult() {
        GameResult.showGameResult();
    }
}
