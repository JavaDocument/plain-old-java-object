package kimjiseung97.class3.app.domain.member;

import kimjiseung97.class3.app.domain.Book.OpenBook;

import java.util.LinkedList;
import java.util.Queue;

public class User implements Member{


    private final OpenBook openBook;

    private String name;

    public User(String name) {
        this.name = name;
        this.openBook = new OpenBook();
    }

    public String getName() {
        return name;
    }

    @Override
    public int findMaxNumber() {
        int leftsumNumber = openBook.getLeftsumNumber();
        int rightsumNumber = openBook.getRightsumNumber();
        int leftnumberMultiple = OpenBook.getLeftnumberMultiple();
        int rightnumberMultiple = OpenBook.getRightnumberMultiple();

        return Math.max(leftsumNumber, Math.max(rightsumNumber, Math.max(leftnumberMultiple, rightnumberMultiple)));
    }
}
