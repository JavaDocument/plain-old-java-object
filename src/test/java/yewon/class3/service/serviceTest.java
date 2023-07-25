package yewon.class3.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yewon.class3.app.handler.OutputHandlerImpl;
import yewon.class3.app.service.Service;

import static org.junit.jupiter.api.Assertions.*;

public class serviceTest {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    @DisplayName("pageSelector()를 통해 만들어진 배열의 첫번째 값은 1 이상 399 이하여야 한다.")
    void pageSelectorTest1() {
        //given
        String[] pageSelector = service.selectPages();
        //when
        int page = Integer.parseInt(pageSelector[0]);
        boolean flag = page >= 1 && page <= 399;
        System.out.println(page);
        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("pageSelector()를 통해 만들어진 배열의 첫번째 값은 두번째값보다 1 적어야 한다.")
    void pageSelectorTest2() {
        //given
        String[] pageSelector = service.selectPages();
        //when
        int zero = Integer.parseInt(pageSelector[0]);
        int first = Integer.parseInt(pageSelector[1]);
        boolean flag = first - zero == 1;
        //then
        assertTrue(flag);
    }
    
    @Test
    @DisplayName("isEvenNumber()의 파라미터가 짝수일시 true, 홀수일시 false 를 리턴해야한다.")
    void isEvenNumberTest() {
//        //given
//        int even = 2;
//        int odd = 399;
//        //when
//        boolean evenFlag = service.isEvenNumber(even);
//        boolean oddFlag = service.isEvenNumber(odd);
//        //then
//        assertTrue(evenFlag);
//        assertFalse(oddFlag);
    }
    
}
