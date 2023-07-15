package woni.class1.app;

import woni.class1.app.calculator.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("계산기 시작");
        int result = calculator.plus();
        System.out.println("===result===");
        System.out.println(result);
    }
}
