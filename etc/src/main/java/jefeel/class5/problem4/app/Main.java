package jefeel.class5.problem4.app;


import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력해주세요: ");
        int money = sc.nextInt();
        int[] result = solution(money);

        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public static int[] solution(int money) {
        int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] result = new int[currency.length];

        for (int i = 0; i < currency.length; i++) {
            result[i] = money / currency[i];
            money %= currency[i];
        }

        return result;
    }
}
