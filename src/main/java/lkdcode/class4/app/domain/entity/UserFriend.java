package lkdcode.class4.app.domain.entity;

import java.util.ArrayList;
import java.util.List;

public record UserFriend(List<String> list) {

    public static UserFriend getInstance() {
        return new UserFriend(new ArrayList<>());
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }

    public void addFriend(String name) {
        list.add(name);
    }

}
