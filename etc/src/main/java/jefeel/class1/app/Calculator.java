package jefeel.class1.app;


public class Calculator {

    public int add(int[] numList) {
        int result = 0;
        for (int element : numList) {
            result += element;
        }
        return result;
    }
}
