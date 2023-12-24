package jefeel.class3.app.domain.calculation;


public class Calculation {

    private int firstNumber;
    private int secondNumber;

    public Calculation() {
        this.firstNumber = myScore(firstNumber);
        this.secondNumber = myScore(secondNumber);
    }
    // 생성자 문제?


    public int addEachNumber(int number) {
        int sum = 0;
        String convertNum = String.valueOf(number);

        char[] digit = convertNum.toCharArray();
        for (char c : digit) {
            sum += c - '0';
        }

        return sum;
    }

    public int multiplyEachNumber(int number) {
        int result = 1;
        String convertNum = String.valueOf(number);

        char[] digit = convertNum.toCharArray();
        for (char c : digit) {
            result = result * (c - '0');
        }

        return result;
    }

    public int compareNumber(int first, int second) {
        return Math.max(first, second);
    }


    public int myScore(int number) {
        int addition = addEachNumber(number);
        int multiplication = multiplyEachNumber(number);

        return compareNumber(addition, multiplication);
    }

}
