package jhlee.class3.app.view;

import jhlee.class3.app.dto.response.PlayResultResponseDTO;
import jhlee.class3.app.entity.FinalNumber;

public class View {

    private View() {

    }

    public static View newInstance() {
        return new View();
    }

    public void showGameResult(PlayResultResponseDTO playResultResponseDTO) {

        System.out.println("게임의 실행 결과는...");
        System.out.println(playResultResponseDTO);

    }
}
