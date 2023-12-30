package com.gof.chap02.strategy.step01;

@FunctionalInterface
interface CalculatorStrategy {
    int execute(int number1, int number2);
}
