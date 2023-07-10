package yewon.class1.app.test;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.DisplayName;
import yewon.class1.app.main.Value;


public class ValueTest {

    @Test
    @DisplayName("Value 클래스를 빌더패턴으로 생성하는 데 성공하고, 생성된 Value 객체의 number 값은 10 이어야한다.")
    public void buildValueTest() {
        //given
        int number = 10;
        //when
        Value value = new Value.ValueBuilder(number).build();
        //then
        assertEquals(10, value.getNumber());
    }

}