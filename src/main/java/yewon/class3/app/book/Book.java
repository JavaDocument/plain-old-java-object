package yewon.class3.app.book;

import yewon.class3.app.common.ParserImpl;

public class Book {

    private String[] selectedPage;
    private final int MIN_PAGE = 1;
    private final int MAX_PAGE = 400;
    private final int NEXT_PAGE = 1;
    private final int PREV_PAGE = -1;
    private final ParserImpl parse;

    public Book() {
        selectedPage = new String[2];
        parse = new ParserImpl();
    }

    // 페이지
    public void open() {
        int randomPage =  (int) (Math.random() * MAX_PAGE) + MIN_PAGE;
        this.selectedPage = makePages(randomPage);
    }

    public String[] getSelectedPage() {
        return this.selectedPage;
    }

    private String[] makePages(int randomPage) {
        if (isEvenNumber(randomPage)) {
            return new String[]{
                    parse.string(randomPage + PREV_PAGE)
                    , parse.string(randomPage)
            };
        }
        return new String[]{
                parse.string(randomPage)
                , parse.string(randomPage + NEXT_PAGE)
        };
    }

    // 짝수이면 true, 홀수이면 false
    private boolean isEvenNumber(int randomInt) {
        return randomInt % 2 == 0;
    }

}
