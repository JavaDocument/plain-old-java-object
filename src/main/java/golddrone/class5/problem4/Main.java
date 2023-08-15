package golddrone.class5.problem4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Integer> solution(final int money) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> moneyClassification = List.of(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);
        int count;
        int balance = money;

        for (Integer index : moneyClassification) {
            count = 0;
            count = balance / index;
            balance = balance % index;
            answer.add(count);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("50237 결과 : " + solution(50237));
        System.out.println("15000 결과 : " + solution(15000));
    }
}
