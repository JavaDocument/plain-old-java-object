package lkdcode.class4.app.domain.repository;

import lkdcode.class4.app.domain.user.PointType;

import java.util.*;

public class RecommendedFriendsList implements SNSRepository {

    private final Map<String, Integer> list;

    public RecommendedFriendsList() {
        list = new HashMap<>();
    }

    @Override
    public List<String> findAllByOrderByPointDesc() {
        List<String> listKeySet = new ArrayList<>(list.keySet());
        listKeySet.sort(this::order);

        return new ArrayList<>(listKeySet);
    }

    private int order(String v1, String v2) {
        final int SAME_POINT_VALUE = 0;
        int compareResult = list.get(v2).compareTo(list.get(v1));

        if (compareResult == SAME_POINT_VALUE) {
            return v1.compareTo(v2);
        }

        return compareResult;
    }

    @Override
    public void addFriend(final String name, final PointType type) {
        final int DEFAULT_POINT = 0;

        list.put(name, list.getOrDefault(name, DEFAULT_POINT) + type.getPoint());
    }

}
