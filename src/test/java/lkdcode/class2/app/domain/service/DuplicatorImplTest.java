package lkdcode.class2.app.domain.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatorImplTest {

    private final Duplicator duplicator = new DuplicatorImpl();

    @Test
    @DisplayName("중복 성공 테스트")
    void isDuplicateTest() {
        // given
        String value1 = "hel";
        String value2 = "hel";

        // when
        boolean duplicate = duplicator.isDuplicate(value1, value2);

        // then
        assertTrue(duplicate);
    }

    @Test
    @DisplayName("중복 실패 테스트")
    void isDuplicateFailTest() {
        // given
        String value1 = "hel";
        String value2 = "hei";

        // when
        boolean duplicate = duplicator.isDuplicate(value1, value2);

        // then
        assertFalse(duplicate);
    }


}