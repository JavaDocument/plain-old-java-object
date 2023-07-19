package jhlee.class2.app.viewer;

import jhlee.class2.app.dto.request.CrewRegisterRequestDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Viewer {

    public static boolean showIndexPage() {

        System.out.println("프로그램 시작!");
        System.out.println("엔터키를 입력해 주세요");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int inputValue = bufferedReader.read();
            return inputValue != -1;
        } catch (IOException e) {
            return false;
        }

    }

    public static CrewRegisterRequestDTO[] showInputPage() {

        System.out.println("크루의 이메일을 입력해 주세요");

        return null;
    }

}
