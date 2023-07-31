package yewon.class4.app.entity;

import java.util.Queue;

import static yewon.class4.app.common.ValueBounds.*;


public class User {

    private final String name;
    private final Friends friends;
    private final Visitors visitors;

    public User(String name, Queue<User> friends, Queue<User> visitors) {
        validateUserNameLength(name);
        validateUserNameFormat(name);
        this.name = name;
        this.friends = new Friends(friends);
        this.visitors = new Visitors(visitors);
    }

    public String getName() {
        return name;
    }

    public Queue<User> getFriends() {
        return friends.getFriends();
    }

    public Queue<User> getVisitors() {
        return visitors.getVisitors();
    }

    private void validateUserNameLength(String userName) {
        if (userName == null || userName.length() > USER_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("사용자 이름은 1자 이상 30자 이하여야 합니다.");
        }
    }

    private void validateUserNameFormat(String userName) {
        for (int i = 0; i < userName.length(); i++) {
            if (userName.charAt(i) < LOWERCASE_A || userName.charAt(i) > LOWERCASE_Z) {
                throw new IllegalArgumentException("사용자 이름은 소문자 영어로 이루어져야합니다.");
            }
        }
    }

    public void addFriend(User user) {
        friends.addFriend(user);
    }

    public void addVisitor(User user) {
        visitors.addVisitor(user);
    }

}
