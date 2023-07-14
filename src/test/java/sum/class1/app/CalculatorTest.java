package sum.class1.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("계산기가 17 더하기 5를 수행한다")
    void testAdd1() {
        calculator.add(17, 5);
        int result = calculator.getResult();
        assertEquals(22, result);
    }

    @Test
    @DisplayName("계산기가 -9 더하기 4를 수행한다")
    void testAdd2() {
        calculator.add(-9, 4);
        int result = calculator.getResult();
        assertEquals(-5, result);
    }





}