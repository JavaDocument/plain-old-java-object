package jhlee.class1.app;

public class PlusOperandQueue<T extends Number> extends OperandQueue<T> {

    private PlusOperandQueue() {}

    public static <T extends Number> PlusOperandQueue<T> newInstance() {
        return new PlusOperandQueue<>();
    }

    @Override
    public double calculate() {
        double result = 0;
        for (T operand : operands) {
            result += operand.doubleValue();
        }
        return result;
    }

}
