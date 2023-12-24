package jhlee.class5.problem2.app.view;

import jhlee.class5.problem2.app.dto.request.RequestDTO;
import jhlee.class5.problem2.app.dto.response.ResponseDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
    private View() {}
    public static View newInstance() {
        return new View();
    }
    public RequestDTO showMainMenu() {
        System.out.println("프로그램에 오신 것을 환영합니다.\n숫자를 입력해주세요");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number;

        try {
            number = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new RequestDTO(number);
    }
    public void showResult(ResponseDTO dto) {
        System.out.println(dto.clapCount());
    }
}
