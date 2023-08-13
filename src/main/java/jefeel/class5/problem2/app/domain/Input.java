package jefeel.class5.problem2.app.domain;


import java.util.Scanner;


public class Input {
    private final Validation validation = new Validation();

    public final int randomNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 숫자를 입력해주세요 (1~10000) : ");
        int number = sc.nextInt();

        if (!validation.validateNumber(number)) {
            System.out.println("올바른 숫자를 다시  입력해주세요");
            return randomNumber();
        }
        sc.close();
        return number;
    }


}
