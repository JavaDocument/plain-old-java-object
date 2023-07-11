package lkdcode.class1.app.domain.calculator;

import lkdcode.class1.app.domain.operator.Operator;

import lkdcode.class1.app.domain.operator.Plus;
import lkdcode.class1.app.domain.util.Converter;


public class Calculator {
    private final Converter converter;
    private Operator operator;
    private double result;

    public Calculator(Converter converter) {
        this.converter = converter;
        this.operator = Plus.getInstance();
    }

    public double calculate(CalculationItems items) {

        while (!items.isEmpty()) {
            String item = items.get();
            double number;

            if (item.equals("+")) {
                operator = Plus.getInstance();
                continue;
            }

            number = converter.to(item);
            result = operator.result(result, number);
        }

        return result;
    }

}