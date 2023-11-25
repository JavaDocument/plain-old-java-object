package jefeel.class5.problem1.app.domain;


public class Solution {

    //    문자열 검사
    public static String solution(String cryptogram) {

        StringBuilder solution = new StringBuilder(cryptogram);

        System.out.println("solution에 담긴 암호: " + solution);

        while (isDuplicate(solution)) {
            removeDuplicate(solution);
        }
        return solution.toString();
    }

    public static boolean isDuplicate(StringBuilder cryptogram) {
        for (int i = 0; i < cryptogram.length() - 1; i++) {
            char letter = cryptogram.charAt(i);
            char nextLetter = cryptogram.charAt(i + 1);
            if (letter == nextLetter) return true;
        }

        return false;
    }

    public static void removeDuplicate(StringBuilder cryptogram) {
        for (int i = 0; i < cryptogram.length() - 1; i++) {
            char letter = cryptogram.charAt(i);
            char nextLetter = cryptogram.charAt(i + 1);
            if (letter == nextLetter) {
                cryptogram.delete(i, i + 2);
            }
        }
    }
}
