package sum.class1.app;

public class Main {
    public static void main(String[] args) {

        InputReader inputReader = new InputReader();

        int num1 = inputReader.readNumber(1);
        int num2 = inputReader.readNumber(2);

        Calculator calculator = new Calculator();

        calculator.add(num1, num2);

        OutputWriter outputWriter = new OutputWriter();

        int result = calculator.getResult();
        outputWriter.printResult(result);

        inputReader.close();
    }
}
