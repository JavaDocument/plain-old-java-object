package jefeel.class5.problem3.app.domain;


public class Validation {

    public final boolean validateWord(String word) {
        int MIN_LENGTH = 1;
        int MAX_LENGTH = 1000;

        return word.length() >= MIN_LENGTH && word.length() <= MAX_LENGTH;
    }
}
