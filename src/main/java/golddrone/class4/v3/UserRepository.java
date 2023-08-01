package golddrone.class4.v3;


import java.util.List;

public interface UserRepository {

    // 이름으로 유저를 찾아 유저 객체를 반환한다 없으면 null 반환
    User findUser(String name);



    // 유저를 저장한다.
    boolean UserSaved(User user);

    // 유저 전체 리스트를 반환한다.
    List<User> findAll();

}
