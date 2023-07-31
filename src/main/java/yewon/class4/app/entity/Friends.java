package yewon.class4.app.entity;

import yewon.class4.app.common.ValueBounds;

import java.util.Queue;

import static yewon.class4.app.common.ValueBounds.MAX;


public class Friends {

//    - friends는 길이가 1 이상 10,000 이하인 리스트/배열이다.
//    - friends의 각 원소는 길이가 2인 리스트/배열로 [아이디 A, 아이디 B] 순으로 들어있다.
//        - 아이디는 길이가 1 이상 30 이하인 문자열이다.

    private final Queue<User> friends;

    public Friends(Queue<User> friends) {
        validateSize(friends);
        this.friends = friends;
    }

    public Queue<User> getFriends() {
        return friends;
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
