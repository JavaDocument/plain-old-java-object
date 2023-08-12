package sharon.class4.app.sns.repository;

import sharon.class4.app.sns.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnsUserRepository implements UserRepository {

    private Map<String, User> users;

    public SnsUserRepository() {
        this.users = new HashMap<>();
    }

    @Override
    public void addUser(String id) {
        users.put(id, new User(id));
    }

    @Override
    public User getUser(String id) {
        return users.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }
}
