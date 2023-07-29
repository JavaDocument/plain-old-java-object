package yewon.class4.app.entity;

import java.util.Queue;

public class User {

    private final String name;
    private final Friends friends;
    private final Visitors visitors;

    public User(String name, Queue<User> friends, Queue<User> visitors) {
        this.name = name;
        this.friends = new Friends(friends);
        this.visitors = new Visitors(visitors);
    }
}
