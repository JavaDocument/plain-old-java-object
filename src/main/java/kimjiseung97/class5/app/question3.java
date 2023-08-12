package kimjiseung97.class5.app;

import com.sun.security.jgss.GSSUtil;

public class question3 {
    public static void main(String[] args) {
        String originalText = "I love you";

        String s = solution(originalText);
        System.out.println(s);
    }

    public static String solution(String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    result.append((char) (65 + (25 - (c - 65))));
                } else {
                    result.append((char) (97 + (25 - (c - 97))));
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
