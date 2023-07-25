package yewon.class3.app.user;

import yewon.class3.app.book.Book;

public class Player {

    private String name;
    private Book book;
    private int maxNumber;

    public Player(String name) {
        this.name = name;
        this.book = new Book();
        this.maxNumber = 0;
    }

    public String getName() {
        return this.name;
    }

    public Book getBook() {
        return this.book;
    }

    public int getMaxNumber() {
        return this.maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
