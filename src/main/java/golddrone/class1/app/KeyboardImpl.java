package golddrone.class1.app;

import java.util.Scanner;

public class KeyboardImpl implements Keyboard {

    private static final Keyboard keyboard = new KeyboardImpl();

    private KeyboardImpl(){}
    public static Keyboard getInstance(){
        return keyboard;
    }
    @Override
    public Long button() {
        return new Scanner(System.in).nextLong();
    }
}
