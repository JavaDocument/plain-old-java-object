package yewon.class1.app.calc;

import java.io.IOException;

import static yewon.class1.app.calc.InputHandler.inputNumber;


/**
 * 계산을 수행하는 클래스
 */
public class Calculator implements Operator {

    public Calculator(){
        try {
            on();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 계산을 실행하는 역할
    public void on() throws IOException {
        showMessage("첫번째 정수: ");
        String inputNumber1 = inputNumber();
        showMessage("두번째 정수: ");
        String inputNumber2 = inputNumber();
        add(inputNumber1, inputNumber2);
    }

    // 덧셈 역할
    @Override
    public void add(String inputNumber1, String inputNumber2) {
        int result = parseInt(inputNumber1) + parseInt(inputNumber2);
        showMessage("Result: " + result);
    }

    // 메세지를 띄우는 역할
    private void showMessage(String message) {
        System.out.print(message);
    }

    // 문자열을 정수로 변환하는 역할
    private int parseInt(String inputValue) {
        return Integer.parseInt(inputValue);
    }

}
