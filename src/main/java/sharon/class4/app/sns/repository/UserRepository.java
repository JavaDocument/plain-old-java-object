package sharon.class4.app.sns.repository;

import sharon.class4.app.sns.domain.User;

import java.util.List;

public interface UserRepository{
    void addUser(String id);
    User getUser(String id);
    void updateUser(User user);
    void deleteUser(String id);
    List<User> getAllUsers();

}
