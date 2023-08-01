package yewon.class4.app.domain;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    private List<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User findUser(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public void removeUser(User user) {
        users.remove(user);
    }
}
