package lkdcode.class1.app.domain.operator;

public class Plus implements Operator {
    private static Plus plus;

    public static Plus getInstance() {
        if (plus == null) {
            plus = new Plus();
        }
        return plus;
    }

    private Plus() {
    }

    @Override
    public double result(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

}
