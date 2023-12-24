package sum.class5.app;

import java.io.InputStreamReader;
import java.util.*;

public class Problem3 {

    public static char frog(char c) {

        if (Character.isUpperCase(c)) {
            char[] upperArr = new char[26];
            for (int i = 0; i < upperArr.length; i++) {
                upperArr[i] = (char) ('A' + i);
            }

            char[] reverseUpperArr = new char[26];
            for (int i = 0; i < upperArr.length; i++) {
                reverseUpperArr[i] = upperArr[upperArr.length - 1 - i];
            }

            for (int i = 0; i < upperArr.length; i++) {
                if (c == upperArr[i])
                    return reverseUpperArr[i];
            }
        }

        if (Character.isLowerCase(c)) {
            char[] lowerArr = new char[26];
            for (int i = 0; i < lowerArr.length; i++) {
                lowerArr[i] = (char) ('a' + i);
            }

            char[] reverselowerArr = new char[26];
            for (int i = 0; i < lowerArr.length; i++) {
                reverselowerArr[i] = lowerArr[lowerArr.length - 1 - i];
            }

            for (int i = 0; i < lowerArr.length; i++) {
                if (c == lowerArr[i])
                    return reverselowerArr[i];
            }
        }


        return c;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if (c == ' ') {
                System.out.print(" ");
            } else {
                char frog = frog(c);
                System.out.print(frog);
            }
        }

    }


}

