package lkdcode.class1.app.domain.calculator;

import lkdcode.class1.app.domain.operator.Operator;
import lkdcode.class1.app.domain.util.Converter;

public class Calculator {
    private final Operator operator;
    private final Converter converter;

    public Calculator(Operator operator, Converter converter) {
        this.operator = operator;
        this.converter = converter;
    }

    public double calculate(CalculationItems items) {
        String firstItem = items.get();
        String secondItem = items.get();

        double firstNumber = converter.to(firstItem);
        double secondNumber = converter.to(secondItem);

        return operator.result(firstNumber, secondNumber);
    }

}
