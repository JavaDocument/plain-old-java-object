package jhlee.class1.app;

public class Calculator {

    private Calculator() {
        super();
    }

    public static Calculator newInstance() {
        return new Calculator();
    }

    public double calculate(OperandQueue<? extends Number> operandStack) {
        return operandStack.calculate();
    }

}
