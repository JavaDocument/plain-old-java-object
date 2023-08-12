package yewon.class4.app.domain;

import java.util.LinkedList;
import java.util.Queue;

import static yewon.class4.app.common.ValueBounds.MAX;

public record Visitors(Queue<User> visitors) {

    public Visitors {
        validateSize(visitors);
    }

    @Override
    public Queue<User> visitors() {
        return new LinkedList<>(visitors);
    }

    private void validateSize(Queue<User> visitors) {
        if (visitors.size() == 0) return;
        if (visitors.size() > MAX) {
            throw new IllegalArgumentException("방문자 목록은 0명 이상 10000명 이하여야 합니다.");
        }
    }

    public void addVisitor(User user) {
        visitors.add(user);
    }
}
