package yewon.class4.app.domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserList {

    private final List<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addVisitorsToUser(User user, String[] visitors) {
        for (String visitor : visitors) {
            User newVisitor = findOrCreateUser(visitor);
            user.addVisitor(newVisitor);
        }
    }

    public void addFriends(String[][] friends) {
        for (String[] friend : friends) {
            User userA = findOrCreateUser(friend[0]);
            User userB = findOrCreateUser(friend[1]);
            userA.addFriend(userB);
            userB.addFriend(userA);
        }
    }

    public User findOrCreateUser(String usersName) {
        for (User user : users) {
            if (user.getName().equals(usersName)) {
                return user;
            }
        }
        User newUser = new User(usersName, new LinkedList<>(), new LinkedList<>());
        users.add(newUser);
        return newUser;
    }

}
