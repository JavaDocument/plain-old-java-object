package lkdcode.class4.app.domain.repository;

import lkdcode.class4.app.domain.user.PointType;

import java.util.*;

public class RecommendedFriendsList implements SNSRepository {

    private final Map<String, Integer> list;

    public RecommendedFriendsList() {
        list = new TreeMap<>(Collections.reverseOrder());
    }

    @Override
    public List<String> getList() {
        return new ArrayList<>(list.keySet());
    }

    @Override
    public void addFriend(final String name, final PointType type) {
        final int DEFAULT_POINT = 0;

        list.put(name, list.getOrDefault(name, DEFAULT_POINT) + type.getPoint());
    }

}
