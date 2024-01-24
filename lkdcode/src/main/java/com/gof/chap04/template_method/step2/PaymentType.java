package com.gof.chap04.template_method.step2;

import java.util.function.Function;

enum PaymentType {

    CASH(value -> value * 0.9),
    CARD(value -> value),
    ACCOUNT_TRANSFER(value -> value * 0.8),
    ;

    private final Function<Double, Double> function;

    PaymentType(Function<Double, Double> function) {
        this.function = function;
    }


    public Double process(final Double value) {
        return function.apply(value);
    }

}
