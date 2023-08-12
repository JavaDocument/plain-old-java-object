package lkdcode.class5.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] RESULT = new int[10_001];

    public static void main(String[] args) throws IOException {
        init();
        System.out.print("테스트 케이스 사이즈를 입력하세요 : ");
        int T = Integer.parseInt(BR.readLine());

        for (int i = 0; i < T; i++) {
            System.out.print("숫자를 입력해주세요 : ");
            int number = Integer.parseInt(BR.readLine());

            System.out.println("답 : " + RESULT[number]);
        }

    }

    private static void init() {

        for (int i = 3; i < RESULT.length; i++) {
            String number = String.valueOf(i);
            int count = 0;
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == '3'
                        || number.charAt(j) == '6'
                        || number.charAt(j) == '9') {
                    count++;
                }
            }
            RESULT[i] = RESULT[i - 1] + count;
        }

    }

}
