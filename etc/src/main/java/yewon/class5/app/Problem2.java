package yewon.class5.app;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        solution(number);
    }

    public static void solution(int number) {
        int answer = 0;

        // number 만큼 반복문을 돌면서 1 ~ 입력받은 숫자까지 문자열로 만든다.
        // 문자열에서 한글자씩 뽑고, 해당 문자가 3, 6, 9 인 경우 손뼉 횟수에 +1
        for (int i = 1; i <= number; i++) {
            String numToString = String.valueOf(i);

            for (int j = 0; j < numToString.length(); j++) {
                char checkNum = numToString.charAt(j);
                if (checkNum == '3') answer++;
                if (checkNum == '6') answer++;
                if (checkNum == '9') answer++;

            }
        }

        System.out.print(answer);
    }
}
