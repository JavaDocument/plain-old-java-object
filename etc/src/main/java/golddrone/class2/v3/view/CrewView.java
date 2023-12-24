package golddrone.class2.v3.view;

import golddrone.class2.v3.common.Validate;
import golddrone.class2.v3.entity.Crew;

import java.util.Scanner;

import static golddrone.class2.v3.common.Validate.*;

public class CrewView {
    private final Scanner scanner;

    public CrewView() {
        scanner = new Scanner(System.in);
    }

    public Crew inputCrew(){
        System.out.println("이메일을 입력하세요.");
        String crewEmail = scanner.next();
        System.out.println("닉네임을 입력하세요.");
        String crewNickname = scanner.next();

        validate(crewEmail, crewNickname);

        return new Crew(crewEmail, crewNickname);
    }

    public void validate(String email, String nickname){
        emailValidate(email);
        domainNameValidate(email);
        nickNameValidate(nickname);
    }


}
