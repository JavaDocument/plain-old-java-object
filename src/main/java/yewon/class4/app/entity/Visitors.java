package yewon.class4.app.entity;

import java.util.Queue;

public class Visitors {
    private final Queue<User> visitors;

    public Visitors(Queue<User> visitors) {
        this.visitors = visitors;
    }
}
