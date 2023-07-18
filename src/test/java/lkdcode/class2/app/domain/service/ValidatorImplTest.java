package lkdcode.class2.app.domain.service;

import lkdcode.class2.app.domain.global.GlobalTestData;
import lkdcode.class2.app.domain.member.Profile;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorImplTest extends GlobalTestData {

    private final Validator validator = new ValidatorImpl();

    @Test
    void checkEmailTest() {
        // given
        Queue<Profile> crewList = super.crewList.get();

        // when
        boolean checkSize = validator.checkSize(crewList);

        // then
        assertTrue(checkSize);
    }

    @Test
    void checkEmailSizeTest() {
        // given
        List<String> emailList = super.crewList.getEmailList();

        // when
        boolean b = validator.checkEmailSize(emailList);

        // then
        assertTrue(b);
    }

    @Test
    void checkNicknameTest() {
        // given
        List<String> nicknameList = super.crewList.getNicknameList();

        // when
        boolean checkNickname = validator.checkNickname(nicknameList);

        // then
        assertTrue(checkNickname);
    }

    @Test
    void checkSizeTest() {
        // given
        List<String> emailList = super.crewList.getEmailList();

        // when
        boolean checkEmail = validator.checkEmail(emailList);

        // then
        assertTrue(checkEmail);
    }
}