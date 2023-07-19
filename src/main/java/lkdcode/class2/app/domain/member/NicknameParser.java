package lkdcode.class2.app.domain.member;

import java.util.LinkedList;
import java.util.Queue;

public class NicknameParser {
    private final Queue<String> nicknameQueue = new LinkedList<>();

    public NicknameParser(String profile) {
        int TWO_CHARACTERS = 2;

        for (int i = 0; i < profile.length() - 1; i++) {
            String nickname = profile.substring(i, i + TWO_CHARACTERS);
            nicknameQueue.add(nickname);
        }
    }

    public String dequeue() {
        return nicknameQueue.poll();
    }

    public boolean isEmpty() {
        return nicknameQueue.isEmpty();
    }

}
