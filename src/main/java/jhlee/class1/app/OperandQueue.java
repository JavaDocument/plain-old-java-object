package jhlee.class1.app;

import java.util.LinkedList;
import java.util.Queue;

public class OperandQueue<T extends Number> {

    protected final Queue<T> operands = new LinkedList<>();

    public void addOperand(T operand) {
        operands.add(operand);
    }

    public void removeOperand() {
        operands.remove();
    }

    public double calculate() {
        return 0;
    }

}
