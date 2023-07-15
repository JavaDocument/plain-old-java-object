package youngsik.class1.app.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValue implements OperatorConversion {

    public void InputInteger() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("첫번째 정수를 입력해주세요");
        String firstInteger = br.readLine();
        while(Verification(firstInteger)){
            System.out.println("정수를 입력해주세요");
            firstInteger = br.readLine();
        }
        System.out.println("두번째 정수를 입력해주세요");
        String secondInteger = br.readLine();
        while(Verification(secondInteger)){
            System.out.println("정수를 입력해주세요");
            secondInteger = br.readLine();
        }
        plus(firstInteger, secondInteger);
    }

    @Override
    public void plus(String firstInteger, String secondInteger) {
        int sum = IntegerConversion(firstInteger) + IntegerConversion(secondInteger);
        System.out.println(firstInteger + " + " + secondInteger + " = " + sum);
    }
    public int IntegerConversion(String StringValue) {
        int IntegerValue = Integer.parseInt(StringValue);
        return IntegerValue;
    }
    public boolean Verification(String InputInteger) {
        try {
            IntegerConversion(InputInteger);
            return true;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }
}
