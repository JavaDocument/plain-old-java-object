package lkdcode.class3.app.domain.page;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageTest {

    private Page page = LeftPage.newInstance();

    @Test
    @DisplayName("랜덤으로 생성되는 페이지의 범위는 3이상 398이하일 것이다. (50만번)")
    void getPageNumberTest() {
        // given
        // when
        // then
        for (int i = 0; i < 500_000; i++) {
            int pageNumber = page.getPageNumber();
            assertTrue(pageNumber >= 3 && pageNumber <= 398);
        }
    }

    @Test
    @DisplayName("페이지의 최대 값을 구해주는 테스트")
    void calculateMaxNumberTest() {
        // given
        // when
        // then
        assertEquals(1, page.calculateMaxNumber(1));
        assertEquals(6, page.calculateMaxNumber(123));
        assertEquals(63, page.calculateMaxNumber(97));
        assertEquals(72, page.calculateMaxNumber(98));
        assertEquals(63, page.calculateMaxNumber(197));
        assertEquals(72, page.calculateMaxNumber(198));
        assertEquals(4, page.calculateMaxNumber(211));
        assertEquals(5, page.calculateMaxNumber(212));
    }
}