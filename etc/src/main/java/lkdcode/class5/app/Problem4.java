package lkdcode.class5.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem4 {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    private static final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
    private static final Queue<int[]> ANSWER = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        System.out.print("테스트 케이스 사이즈를 입력하세요 : ");
        int T = Integer.parseInt(BR.readLine());

        for (int i = 0; i < T; i++) {
            int money = Integer.parseInt(BR.readLine());
            int[] list = new int[MONEYS.length];

            for (int j = 0; j < MONEYS.length; j++) {
                list[j] = money / MONEYS[j];
                money %= MONEYS[j];
            }
            ANSWER.add(list);
        }

        while (!ANSWER.isEmpty()) {
            int[] list = ANSWER.poll();

            for (int i : list) {
                sb.append(i)
                        .append(", ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.append(System.lineSeparator());
        }

        System.out.println(sb);

    }
}
