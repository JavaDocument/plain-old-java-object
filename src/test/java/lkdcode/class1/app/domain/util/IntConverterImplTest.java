package lkdcode.class1.app.domain.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntConverterImplTest {

    private Converter converter;

    @BeforeEach
    void init() {
        this.converter = new IntConverterImpl();
    }

    @Test
    @DisplayName("문자열을 숫자로 바꿔주는 메서드 테스트")
    void toTest() {
        // given
        String target = "235";

        // when
        double parseNumber = converter.to(target);

        // then
        assertEquals(235, parseNumber);
    }
}