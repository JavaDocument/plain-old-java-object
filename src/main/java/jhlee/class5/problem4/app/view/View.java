package jhlee.class5.problem4.app.view;

import jhlee.class5.problem4.app.dto.request.RequestDTO;
import jhlee.class5.problem4.app.dto.response.ResponseDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
    private View() {}
    public static View newInstance() {
        return new View();
    }
    public RequestDTO showMainMenu() {
        System.out.println("프로그램을 시작합니다.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String money;

        try {
            money = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new RequestDTO(Integer.parseInt(money));
    }
    public void showResult(ResponseDTO dto) {
        int[] result = dto.result();
        for (int i : result) {
            System.out.print(i + ", ");
        }
    }
}
