package sum.class3.app.util;

public class WinnerUtil {

    private final int POBI_WIN = 1;
    private final int CRONT_WIN = 2;
    private final int DAWN = 0;

    public int showWinner(int pobiNumber, int crongNumber) {
        if (pobiNumber > crongNumber) {
            System.out.println("포비가 이겼습니다 🎉");
            return POBI_WIN;
        } else if (pobiNumber < crongNumber) {
            System.out.println("크롱이 이겼습니다 🎉");
            return CRONT_WIN;
        } else {
            System.out.println("무승부입니다! ");
            return DAWN;
        }
    }

}
