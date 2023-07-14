package jefeel.class1.app;


import java.util.Scanner;


public class InputInt {
    // 정수를 입력받는 클래스
    private final Scanner sc;

    public InputInt() {
        sc = new Scanner(System.in);
    }

    public int inputNumber(){
        return Integer.parseInt(sc.nextLine());
    }

}
