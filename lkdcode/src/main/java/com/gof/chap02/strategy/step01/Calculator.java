package com.gof.chap02.strategy.step01;

class Calculator {

    private final int number1;
    private final int number2;
    private CalculatorStrategy calculatorStrategy;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void updateStrategy(CalculatorStrategy calculatorStrategy) {
        this.calculatorStrategy = calculatorStrategy;
    }

    public Integer process() {
        if (calculatorStrategy != null) {
            return calculatorStrategy.execute(number1, number2);
        }
        return null;
    }
}
