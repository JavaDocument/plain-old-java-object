package com.gof.chap04.template_method.step1;

abstract class Calculator {

    public final int process(final int number1, final int number2) {
        System.out.println("=== Calculator 실행 ===");
        return formula(number1, number2);
    }

    protected abstract int formula(final int number1, final int number2);
}
