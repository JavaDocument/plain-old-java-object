package jefeel.class5.problem1.app.domain;


public class Validation {

    public static final int MAX_LENGTH = 1000;

    //입력 문자열 검증
    public static boolean validateCode(String cryptogram) {
        if (cryptogram.isEmpty()) return false; //입력이 없으면
        return cryptogram.length() <= MAX_LENGTH;
    }
}
