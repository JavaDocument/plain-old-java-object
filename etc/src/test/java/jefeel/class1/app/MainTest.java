package jefeel.class1.app;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("두 개의 정수를 더하는 계산기 테스트")
    void calculateTest() {
        int[] arr = {3, 5};
        //given
        int result = calculator.add(arr);
        //when
        //then
        assertEquals(8, result);
    }


}