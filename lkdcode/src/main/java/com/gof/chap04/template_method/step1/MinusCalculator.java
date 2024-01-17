package com.gof.chap04.template_method.step1;

class MinusCalculator extends Calculator {

    @Override
    protected int formula(int number1, int number2) {
        return number1 - number2;
    }
}
