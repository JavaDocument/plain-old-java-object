package jefeel.class5.problem1.app;


import java.util.Scanner;


public class Main {

    public static final int MAX_LENGTH = 1000;

    public static void main(String[] args) {

        String cryptogram = inputCode();
        String solution = solution(cryptogram);
        System.out.println("암호 해독: " + solution);
    }

    //문자열 입력
    public static String inputCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("암호를 입력해주세요 : ");
        String code = sc.nextLine();

        if (!validateCode(code)) {
            System.out.println("다시 암호를 입력해주세요");
            return inputCode();
        }
        return code;
    }


    //입력 문자열 검증
    public static boolean validateCode(String cryptogram) {
        if (cryptogram.isEmpty()) return false; //입력이 없으면
        return cryptogram.length() <= MAX_LENGTH;
    }


    //    문자열 검사
    public static String solution(String cryptogram) {

        StringBuilder result = new StringBuilder();

        for (char c : cryptogram.toCharArray()) {

            if (!result.isEmpty() && result.charAt(result.length() - 1) == c) {
                result.deleteCharAt(result.length() - 1); // 중복 문자 제거
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}

