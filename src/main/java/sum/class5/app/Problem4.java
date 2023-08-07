package sum.class5.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int[] money = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < money.length; i++) {
            int bills = input / money[i];
//            System.out.println(money[i] + " " + bills);
            input %= money[i];
            result.add(bills);
        }
        System.out.println(result);

    }
}
