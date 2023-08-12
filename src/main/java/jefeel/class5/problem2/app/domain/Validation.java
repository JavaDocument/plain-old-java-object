package jefeel.class5.problem2.app.domain;


public class Validation {
    public final boolean validateNumber(int number) {
        int MIN_NUM = 1;
        int MAX_NUM = 10000;
        return number >= MIN_NUM && number <= MAX_NUM;
    }
}
