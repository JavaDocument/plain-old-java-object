package golddrone.class1.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {

    private final Calculator calculator = new CalculatorImpl();
    @Test
    @DisplayName("5와 13을 더하면 18 결과가 나와야 한다.")
    void addition() {
        // given
        Long firstInteger = 5L;
        Long secondInteger = 13L;
        // when
        Long result = calculator.addition(firstInteger, secondInteger);
        // then
        assertEquals(18L, result);
    }

    @Test
    @DisplayName("-5와 1을 더하면 -4 결과가 나와야 한다.")
    void addition2() {
        // given
        Long firstInteger = -5L;
        Long secondInteger = 1L;
        // when
        Long result = calculator.addition(firstInteger, secondInteger);
        // then
        assertEquals(-4L, result);
    }
}