package yewon.class4.app.domain;

import java.util.LinkedList;
import java.util.Queue;

import static yewon.class4.app.common.ValueBounds.MAX;


public record Friends(Queue<User> friends) {

    public Friends {
        validateSize(friends);
    }

    @Override
    public Queue<User> friends() {
        return new LinkedList<>(friends);
    }

    private void validateSize(Queue<User> friends) {
        if (friends.size() == 0) return;
        if (friends.size() > MAX) {
            throw new IllegalArgumentException("친구 목록은 1명 이상 10000명 이하여야 합니다.");
        }
    }

    public void addFriend(User user) {
        friends.add(user);
    }
}
