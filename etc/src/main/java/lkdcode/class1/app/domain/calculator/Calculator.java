package lkdcode.class1.app.domain.calculator;

import lkdcode.class1.app.domain.operator.Operator;

import lkdcode.class1.app.domain.operator.Plus;
import lkdcode.class1.app.domain.util.Converter;

import java.util.Objects;
import java.util.stream.Stream;

import static lkdcode.class1.app.domain.operator.OperatorType.PLUS;


public class Calculator {
    private final Converter converter;
    private final double ZERO = 0.0;
    private Operator operator;


    public Calculator(Converter converter) {
        this.converter = converter;
        this.operator = Plus.getInstance();
    }

    public double calculate(CalculationItems items) {
        return Stream.generate(items::get)
                .takeWhile(Objects::nonNull)
                .mapToDouble(this::processItem)
                .reduce(ZERO, (firstNumber, secondNumber) -> operator.result(firstNumber, secondNumber));
    }

    private double processItem(String item) {
        if (item.equals(PLUS.getType())) {
            operator = Plus.getInstance();
            return ZERO;
        }

        return converter.to(item);
    }


}