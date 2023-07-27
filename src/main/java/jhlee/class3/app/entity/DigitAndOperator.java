package jhlee.class3.app.entity;

import jhlee.class3.app.enumeration.Operator;

import java.util.LinkedList;
import java.util.Queue;

public class DigitAndOperator {

    private final Queue<Integer> digitQueue;
    private Operator operator;

    private DigitAndOperator(int number) {
        this.digitQueue = new LinkedList<>();
        getDigitQueueAndOperator(number);
    }

    public static DigitAndOperator of(int number) {
        return new DigitAndOperator(number);
    }

    public int getResultNumber() {
        int resultNumber = digitQueue.poll();

        switch (operator) {
            case ADD -> {
                while (!digitQueue.isEmpty()) {
                    resultNumber += digitQueue.poll();
                }
            }
            case MUL -> {
                while (!digitQueue.isEmpty()) {
                    resultNumber *= digitQueue.poll();
                }
            }
            default -> {
            }
        }

        return resultNumber;
    }

    private void getDigitQueueAndOperator(int number) {

        this.operator = Operator.MUL;

        int processingNumber = number;

        while (processingNumber != 0) {
            int digit = processingNumber % 10;

            if (digit == 0 || digit == 1) {
                this.operator = Operator.ADD;
            }

            this.digitQueue.add(digit);
            processingNumber /= 10;
        }

    }

}
