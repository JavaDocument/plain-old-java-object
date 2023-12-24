package golddrone.class2.v3.common;

import golddrone.class2.v3.entity.Crew;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {

    @Test
    @DisplayName("크루원 인원수 검증 테스트 1개의 데이터를 넣으면 테스트 성공해야합니다.")
    void crewValidate() {
        List<Crew> list = new ArrayList<>();
        list.add(new Crew("aaa@naver.com", "하하호호"));
        boolean crewValidate = Validate.crewValidate(list);
        Assertions.assertTrue(crewValidate);

    }

    @Test
    @DisplayName("크루원 닉네임 검증 테스트")
    void nickNameValidate() {
        String nickname = "하하호호";
        boolean nameValidate = Validate.nickNameValidate(nickname);
        Assertions.assertTrue(nameValidate);
    }

    @Test
    @DisplayName("크루원 도메인 이름 검증 테스트")
    void domainNameValidate() {
        String domain = "ddddd@email.com";
        boolean domainNameValidate = Validate.domainNameValidate(domain);
        Assertions.assertTrue(domainNameValidate);
    }

    @Test
    @DisplayName("크루원 이메일 길이 검증 테스트")
    void emailValidate() {
        String email = "eeeeee@email.com";
        boolean emailValidate = Validate.emailValidate(email);
        Assertions.assertTrue(emailValidate);
    }
}