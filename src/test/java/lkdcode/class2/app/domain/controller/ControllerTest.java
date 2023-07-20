package lkdcode.class2.app.domain.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    private Controller controller;

    @BeforeEach
    void init() {
        String[][] list = {{"jm@email.com", "제이엠"}};
//                {"jason@email.com", "제이슨"},
//                {"woniee@email.com", "워니"},
//                {"mj@email.com", "엠제이"},
//                {"nowm@email.com", "이제엠"}};

        controller = new Controller(list);
    }

    @Test
    @DisplayName("test")
    void test() {
        // given
        controller.solution();


        // when


        // then


    }

}