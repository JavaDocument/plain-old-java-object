package sum.class5.app;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();

        String input = "333";

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            // 3, 6, 9 포함된 숫자
            if (input.charAt(i) == '3' || input.charAt(i) == '6' || input.charAt(i) == '9') {
                count++;
            }
            // 0 ~ 10 (3), 11 ~ 20 (3)
            // 0, 1, 2, 3 - 1
            // 4, 5, 6 - 1
            // 7, 8, 9 - 1
//            Integer.parseInt(input) // 13 - 3,6,9,1
//            if (Integer.parseInt(input))
        }
        System.out.println(count);

    }
}
