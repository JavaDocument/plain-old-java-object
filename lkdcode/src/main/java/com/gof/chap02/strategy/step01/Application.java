package com.gof.chap02.strategy.step01;

import java.util.Comparator;
import java.util.List;

class Application {
    public static void main(String[] args) {
        final int number1 = 23;
        final int number2 = -2639;

        Calculator calculator = new Calculator(number1, number2);

        calculator.updateStrategy((a, b) -> a + b);
        Integer result1 = calculator.process();
        calculator.updateStrategy((a, b) -> a - b);
        Integer result2 = calculator.process();
        calculator.updateStrategy((a, b) -> a * b);
        Integer result3 = calculator.process();
        calculator.updateStrategy((a, b) -> a / b);
        Integer result4 = calculator.process();
        calculator.updateStrategy((a, b) -> a % b);
        Integer result5 = calculator.process();
        calculator.updateStrategy((a, b) -> b + a);
        Integer result6 = calculator.process();
        calculator.updateStrategy((a, b) -> b - a);
        Integer result7 = calculator.process();
        calculator.updateStrategy((a, b) -> b * a);
        Integer result8 = calculator.process();
        calculator.updateStrategy((a, b) -> b / a);
        Integer result9 = calculator.process();
        calculator.updateStrategy((a, b) -> b % a);
        Integer result10 = calculator.process();

        final List<Integer> list = new java.util.ArrayList<>(List.of(
                result1
                , result2
                , result3
                , result4
                , result5
                , result6
                , result7
                , result8
                , result9
                , result10
        ));

        list.sort(Comparator.reverseOrder());
        System.out.println(list.get(0));

    }
}
