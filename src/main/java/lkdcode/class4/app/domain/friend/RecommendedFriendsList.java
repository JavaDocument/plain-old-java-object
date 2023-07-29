package lkdcode.class4.app.domain.friend;

import lkdcode.class4.app.domain.user.PointType;

import java.util.*;

public class RecommendedFriendsList {

    private final Map<String, Integer> list;

    public RecommendedFriendsList() {
        list = new TreeMap<>(Collections.reverseOrder());
    }

    public List<String> getList() {
        return new ArrayList<>(list.keySet());
    }

    public void addFriend(String name, PointType type) {
        list.put(name, list.getOrDefault(name, 0) + type.getPoint());
    }

}
