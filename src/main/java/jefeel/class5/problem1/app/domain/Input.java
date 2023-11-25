package jefeel.class5.problem1.app.domain;


import java.util.Scanner;

import static jefeel.class5.problem1.app.domain.Validation.validateCode;


public class Input {

    //문자열 입력
    public static String inputCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("암호를 입력해주세요 : ");
        String code = sc.nextLine();

        if (!validateCode(code)) {
            System.out.println("다시 암호를 입력해주세요");
            return inputCode();
        }

        sc.close();
        return code;
    }

}
