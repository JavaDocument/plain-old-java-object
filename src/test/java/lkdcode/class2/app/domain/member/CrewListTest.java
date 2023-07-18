package lkdcode.class2.app.domain.member;

import lkdcode.class2.app.domain.global.GlobalTestData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class CrewListTest extends GlobalTestData {

    @Test
    void getTest() {
        // given
        Queue<Profile> queue = super.crewList.get();

        // when

        // then
        assertEquals(5, queue.size());

    }

    @Test
    void getEmail() {
        // given
        List<String> emailList = super.crewList.getEmailList();

        // wehn

        // then
        assertEquals(emailList.get(1), "jason@email.com");

    }

    @Test
    void getNickname() {
        // given
        List<String> nicknameList = super.crewList.getNicknameList();

        // wehn

        // then
        assertEquals(nicknameList.get(2), "워니");

    }
}