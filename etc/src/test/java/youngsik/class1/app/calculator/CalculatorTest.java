package youngsik.class1.app.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import woni.class1.app.calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();

    }

    @Test
    @DisplayName("15 더하기 3은 18이 나와야 한다")
    void calculateTest() {


    }
    @Test
    @DisplayName("-5 더하기 1은 -4가 나와야 한다")
    void calculateTest2() {

    }


}