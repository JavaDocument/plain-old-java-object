package lkdcode.class5.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {

    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.print("테스트 케이스 사이즈를 입력하세요 : ");
        int T = Integer.parseInt(BR.readLine());

        for (int k = 0; k < T; k++) {
            System.out.print("문자열을 입력하세요 : ");
            StringBuffer str = new StringBuffer(BR.readLine());

            while (isDuplicate(str)) {

                for (int i = 0; i < str.length() - 1; i++) {
                    char target = str.charAt(i);
                    int count = 1;

                    for (int j = i + 1; j < str.length(); j++) {
                        char checkTarget = str.charAt(j);
                        if (target != checkTarget) break;
                        count++;
                    }

                    if (count > 1) {
                        for (int j = 0; j < count; j++) {
                            str.deleteCharAt(i);
                        }
                    }

                }
            }

            System.out.println(str);
        }

    }

    private static boolean isDuplicate(StringBuffer str) {

        for (int i = 0; i < str.length() - 1; i++) {
            char target = str.charAt(i);
            char nextTaget = str.charAt(i + 1);
            if (target == nextTaget) return true;
        }

        return false;
    }

}
