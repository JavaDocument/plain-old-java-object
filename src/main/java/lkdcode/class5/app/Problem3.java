package lkdcode.class5.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Problem3 {

    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder RESULT = new StringBuilder();
    private static final Map<String, String> REVERSE = new HashMap<>();

    public static void main(String[] args) throws IOException {
        init();

        System.out.print("테스트 케이스 사이즈를 입력하세요 : ");
        int T = Integer.parseInt(BR.readLine());

        for (int i = 0; i < T; i++) {
            System.out.print("글자를 입력하세요 : ");
            String word = BR.readLine();

            for (int j = 0; j < word.length(); j++) {
                String target = String.valueOf(word.charAt(j));

                RESULT.append(REVERSE.getOrDefault(target, target));
            }
            RESULT.append(System.lineSeparator());
        }

        System.out.println(RESULT);
    }

    private static void init() {
        final int alphabetSize = 26;
        final int asciiUpper = 65;
        final int asciiLower = 97;

        final int asciiUpperReverse = 90;
        final int asciiLowerReverse = 122;

        for (int i = 0; i < alphabetSize; i++) {

            char upper = (char) (asciiUpper + i);
            char lower = (char) (asciiLower + i);
            char upperReverse = (char) (asciiUpperReverse - i);
            char lowerReverse = (char) (asciiLowerReverse - i);

            String upperKey = String.valueOf(upper);
            String upperValue = String.valueOf(upperReverse);

            String lowerKey = String.valueOf(lower);
            String lowerValue = String.valueOf(lowerReverse);

            REVERSE.put(upperKey, upperValue);
            REVERSE.put(lowerKey, lowerValue);
        }

    }
}
