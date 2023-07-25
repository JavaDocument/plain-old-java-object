package lkdcode.class3.app.domain.member;

import lkdcode.class3.app.domain.page.Book;
import lkdcode.class3.app.domain.page.Open;

public class Crong implements Player {
    private final Book book;

    public Crong() {
        this.book = openBook();
    }

    @Override
    public Book openBook() {
        return Open.newInstance();
    }

    @Override
    public int getPlayerNumber() {
        return book.getMaxNumber();
    }

}
