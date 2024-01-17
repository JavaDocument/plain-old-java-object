package com.gof.chap04.template_method.step1;

class Application {

    public static void main(String[] args) {
        final Calculator calculator1 = new PlusCalculator();
        final Calculator calculator2 = new MinusCalculator();

        final int number1 = 123;
        final int number2 = 45;

        System.out.println(calculator1.process(number1, number2));
        System.out.println("----------------------");
        System.out.println(calculator2.process(number1, number2));
    }
}
