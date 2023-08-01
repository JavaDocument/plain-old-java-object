package golddrone.class4.v3;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private static final List<User> userStorage;

    static {
        userStorage = new ArrayList<>();
    }


    @Override
    public User findUser(String name) {
        for(User user : userStorage){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean UserSaved(User user) {
        if(findUser(user.getName())==null) {
            userStorage.add(user);
            return true;
        }
        return false;
    }

    @Override
    public List<User> findAll() {
        // 복사본 반환 피드백 반영
        return new ArrayList<>(userStorage);
    }


}
