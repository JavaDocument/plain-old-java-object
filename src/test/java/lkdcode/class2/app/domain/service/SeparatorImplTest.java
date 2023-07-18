package lkdcode.class2.app.domain.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class SeparatorImplTest {

    private final Separator separator = new SeparatorImpl();

    @Test
    @DisplayName("제임스를 스플릿하면 사이즈는 2가 될 것이다.")
    void splitSizeTest() {
        String target = "제임스";
        Queue<String> split = separator.split(target);

        Assertions.assertEquals(split.size(), 2);
    }

    @Test
    @DisplayName("제임스제임임제시임스를 스플릿하면 제임,임스,스제,제임,임임,임제,제시,시임,임스 가 리턴 될 것이다.(2글자씩)")
    void splitValueTest() {
        String target = "제임스제임임제시임스";

        Queue<String> split = separator.split(target);

        List<String> expected = Arrays.asList("제임", "임스", "스제", "제임", "임임", "임제", "제시", "시임", "임스");
        List<String> splitted = new ArrayList<>(split);

        assertEquals(expected, splitted);
    }

}