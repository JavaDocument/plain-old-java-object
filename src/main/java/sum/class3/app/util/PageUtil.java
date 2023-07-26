package sum.class3.app.util;

public class PageUtil {

    private final int MAX_PAGE = 400;
    private final int MIN_PAGE = 1;

    public int openBook() {
        int oddRandomPage;
        do {
            int randomPage = (int) Math.floor(Math.random() * MAX_PAGE) + MIN_PAGE;
            oddRandomPage = randomPage % 2 != 0 ? randomPage : -1;
        } while (oddRandomPage == -1 || oddRandomPage == 1 || oddRandomPage == 399);

        return oddRandomPage;
    }


}
