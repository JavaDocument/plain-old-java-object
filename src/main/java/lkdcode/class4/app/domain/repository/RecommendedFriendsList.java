package lkdcode.class4.app.domain.repository;

import lkdcode.class4.app.domain.user.PointType;

import java.util.*;

public class RecommendedFriendsList implements SNSRepository<List<String>> {

    private final Map<String, Integer> list;

    public RecommendedFriendsList() {
        list = new TreeMap<>(Collections.reverseOrder());
    }

    @Override
    public List<String> getList() {
        return new ArrayList<>(list.keySet());
    }

    @Override
    public void addFriend(String name, PointType type) {
        list.put(name, list.getOrDefault(name, 0) + type.getPoint());
    }

}
