package golddrone.class1.app;

import java.util.Scanner;

public class KeyboardImpl implements Keyboard {

    private static final KeyboardImpl keyboard = new KeyboardImpl();

    private KeyboardImpl(){}
    public static KeyboardImpl getInstance(){
        return keyboard;
    }
    // 타입에 대한 의미를 생각해보기
    @Override
    public Long button() {
        return new Scanner(System.in).nextLong();
    }
}
