package lkdcode.class2.app.domain.service;

import java.util.LinkedList;
import java.util.Queue;

public class SeparatorImpl implements Separator {
    private final Queue<String> nameParts = new LinkedList<>();

    @Override
    public Queue<String> split(String nickname) {
        // TODO : 변수 네이밍
        int START_IDX = 0;
        int LENGTH_IDX = 1;
        int SPLIT_IDX = 2;

        for (int i = START_IDX; i < nickname.length() - LENGTH_IDX; i++) {
            String part = nickname.substring(i, i + SPLIT_IDX);
            nameParts.add(part);
        }

        return nameParts;
    }

}
