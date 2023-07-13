package yewon.class1.app.test;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import yewon.class1.app.calc.InputHandler;

import static org.junit.Assert.*;


public class InputHandlerTest {

    @Test
    @DisplayName("null 값을 입력할 경우 false 가 리턴되어야 한다.")
    public void isIntegerTest1() {
        // given
        String inputValue = null;
        // when
        boolean flag = InputHandler.isInteger(inputValue);
        // then
        assertFalse(flag);
    }

    @Test
    @DisplayName("정수가 아닌 값을 입력할 경우 false 가 리턴되어야 한다.")
    public void isIntegerTest2() {
        // given
        String inputValue = "자몽";
        // when
        boolean flag = InputHandler.isInteger(inputValue);
        // then
        assertFalse(flag);
    }

}