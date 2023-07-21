package jhlee.class2.app.viewer;

import jhlee.class2.app.dto.request.CrewRegisterRequestDTO;
import jhlee.class2.app.entity.Crew;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Viewer {

    private Viewer() {}

    public static Viewer newInstance() {
        return new Viewer();
    }

    public void showIndexPage() {

        System.out.println("프로그램 시작!");
        System.out.println("엔터키를 입력해 주세요");

    }

    public Queue<CrewRegisterRequestDTO> showInputPage() {

        Queue<CrewRegisterRequestDTO> crewRegisterRequestDTOQueue = new LinkedList<>();

        System.out.println("크루의 정보를 입력해주세요");
        System.out.println("종료를 원하면 아무것도 입력하지 말고 엔터를 누르세요");

        while (true) {

            CrewRegisterRequestDTO crewRegisterRequestDTO = receiveEmailAndNickname();

            if (crewRegisterRequestDTO == null) break;

            crewRegisterRequestDTOQueue.add(crewRegisterRequestDTO);

        }

        return crewRegisterRequestDTOQueue;
    }

    public void printResult(List<Crew> crewList) {
        System.out.print("[");
        for (int i = 0; i < crewList.size(); i++) {
            if (i > 0) System.out.println(",");
            System.out.print(crewList.get(i));
        }
        System.out.println("]");
    }

    private CrewRegisterRequestDTO receiveEmailAndNickname() {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("이메일을 입력해 주세요");
            String email = bufferedReader.readLine();

            if (email.equals("")) return null;

            System.out.println("닉네임을 입력해 주세요");
            String nickname = bufferedReader.readLine();

            if (nickname.equals("")) return null;

            return CrewRegisterRequestDTO.builder()
                    .email(email)
                    .nickname(nickname)
                    .build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
