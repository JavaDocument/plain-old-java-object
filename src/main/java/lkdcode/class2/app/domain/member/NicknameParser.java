package lkdcode.class2.app.domain.member;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NicknameParser {
    private final Queue<String> nicknameQueue = new LinkedList<>();

    public NicknameParser(final String profile) {
        int TWO_CHARACTERS = 2;

        IntStream.range(0, profile.length() - 1)
                .mapToObj(i -> profile.substring(i, i + TWO_CHARACTERS))
                .forEach(nicknameQueue::add);
    }

    public String dequeue() {
        return nicknameQueue.poll();
    }

    public boolean isNotEmpty() {
        return !nicknameQueue.isEmpty();
    }

}
