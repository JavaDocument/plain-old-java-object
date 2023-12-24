package lkdcode.class1.app.domain.calculator;

import lkdcode.class1.app.domain.util.Converter;
import lkdcode.class1.app.domain.util.DoubleConverterImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        Converter converter = new DoubleConverterImpl();
        calculator = new Calculator(converter);
    }

    @Test
    @DisplayName("두 정수의 합을 구하는 메서드 테스트")
    void calculateTest() {
        // given
        CalculationItems items = new CalculationItems();
        items.add("141");
        items.add("2");

        // when
        double result = calculator.calculate(items);

        // then
        assertEquals(143.0, result);
    }

}