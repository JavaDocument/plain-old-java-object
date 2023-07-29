package yewon.class4.app.entity;

import java.util.Queue;

public class Friends {
    private final Queue<User> friends;

    public Friends(Queue<User> friends) {
        this.friends = friends;
    }
}
