package jhlee.class5.problem1.app.view;

import jhlee.class5.problem1.app.dto.request.RequestDTO;
import jhlee.class5.problem1.app.dto.response.ResponseDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
    private View() {
    }

    public static View newInstance() {
        return new View();
    }

    public RequestDTO showMainMenu() {
        System.out.println("프로그램을 시작합니다.");

        String cryptogram = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            cryptogram = requestCryptogram(br);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return new RequestDTO(cryptogram);
    }

    private static String requestCryptogram(BufferedReader br) throws IOException {
        System.out.println("암호문을 입력해주세요");
        return br.readLine();
    }

    public void showResult(ResponseDTO decrypt) {
        System.out.println("결과는 \"" + decrypt + "\"");
    }
}
