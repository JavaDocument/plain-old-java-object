package sum.class1.app;

import java.util.Scanner;

public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }

    public void add(int num1, int num2) {
        result = num1 + num2;
    }

    public int getResult() {
        return result;
    }
}
