package yewon.class1.app.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력 핸들러
 */
public class InputHandler {

    // 값을 입력받는 역할
    public static String inputNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = br.readLine();
        while (!isInteger(inputNumber)) {
            System.out.println("정수를 입력해주세요!");
            inputNumber = br.readLine();
        }
        return inputNumber;
    }

    // 문자열이 정수인지, null 이 아닌지 확인하는 메서드
    public static boolean isInteger(String inputNumber) {
        try {
            Integer.parseInt(inputNumber);
            return true;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }

}
