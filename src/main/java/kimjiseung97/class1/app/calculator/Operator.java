package kimjiseung97.class1.app.calculator;

import java.util.List;

public class Operator implements Calculator {
    @Override
    public double calculator(List<Character> objects) {

        char operator = objects.get(1);
        double firstNum = Integer.parseInt(String.valueOf(objects.get(0)));
        double secondNum = Integer.parseInt(String.valueOf(objects.get(2)));

        double result = 0.0;
        switch (operator) {
            case '+':
                result += firstNum + secondNum;
                break;
            case '-':
                result += firstNum - secondNum;
                break;
            case '*':
                result += firstNum * secondNum;
                break;
            case '/':
                result += firstNum / secondNum;
                break;
            case '%':
                result += firstNum % secondNum;
                break;
        }
        return result;
    }
}
