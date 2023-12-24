package jhlee.class3.app.entity;

import jhlee.class3.app.enumeration.Operator;

import java.util.LinkedList;
import java.util.Queue;

public class FinalNumber {

    private final int evenNumber;
    private final int oddNumber;
    private final int resultNumber;

    private FinalNumber(int evenNumber) {
        this.evenNumber = evenNumber;
        this.oddNumber = getPairNumber(evenNumber);
        int evenResultNumber = DigitAndOperator.of(evenNumber)
                .getResultNumber();
        int oddResultNumber = DigitAndOperator.of(oddNumber)
                .getResultNumber();
        this.resultNumber = Math.max(evenResultNumber, oddResultNumber);
    }

    public static FinalNumber of(int evenNumber) {
        return new FinalNumber(evenNumber);
    }

    private int getPairNumber(int givenNumber) {
        return givenNumber - 1;
    }

    public int getResultNumber() {
        return resultNumber;
    }
}
