package yewon.class5.app;

import java.util.Scanner;

public class Problem3 {
    // A = 65
    // Z = 90

    // B = 66
    // Y = 89

    // C = 67
    // X = 88

    // 입력한 값에서.. A 값을 빼면 A 로부터 얼마가 더해진 문자인지 알 수 있음
    // 그 값을 Z 에서 빼면 반대값이 나올 것

    public static final int A = 65;
    public static final int Z = 90;
    public static final int a = 97;
    public static final int z = 122;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder answer = new StringBuilder();

        // 대문자, 소문자, 공백 판별
        for (char c : word.toCharArray()) {
            if (c == ' ') {
                answer.append(" ");
                continue;
            }
            answer.append(changeChar(c));
        }

        System.out.print(answer);

        sc.close();
    }

    public static char changeChar(char c) {
        // 대문자인가?
        if (isUpperCase(c)) {
            return (char) ( Z - ( c - A ));
        }

        // 소문자인가?
        return (char) ( z - ( c - a ));
    }

    public static boolean isUpperCase(char c) {
        return c >= A && c <= Z;
    }
}
