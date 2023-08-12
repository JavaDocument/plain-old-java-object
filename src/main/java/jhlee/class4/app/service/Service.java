package jhlee.class4.app.service;

import jhlee.class4.app.dto.request.RequestDTO;
import jhlee.class4.app.dto.response.ResponseDTO;
import jhlee.class4.app.entity.FriendsGraph;

import java.util.*;

public class Service {

    private Service() {}

    public static Service newInstance() {
        return new Service();
    }

    public ResponseDTO getRecommendUserList(RequestDTO dto) {
        String user = dto.user();
        FriendsGraph friendsGraph = FriendsGraph.of(dto.friends());
        Set<String> friendSet = friendsGraph.getFriendSet(user);

        Map<String, Integer> friendScoreMap = friendsGraph.calculateCommonFriendScoreMap(user);
        Map<String, Integer> visitScoreMap = calculateVisitScoreMap(dto.visitors(), friendSet);
        friendScoreMap.forEach((k, v) -> visitScoreMap.merge(k, v, Integer::sum));

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(visitScoreMap.entrySet());
        entryList.sort((o1, o2) -> {
            int result = o2.getValue() - o1.getValue();
            if (result == 0) return o1.getKey().compareTo(o2.getKey());
            return result;
        });

        Queue<String> recommendFriendQueue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            try {
                recommendFriendQueue.add(entryList.get(i).getKey());
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }

        return new ResponseDTO(recommendFriendQueue);
    }

    private Map<String, Integer> calculateVisitScoreMap(List<String> visitors, Set<String> friendSet) {
        Map<String, Integer> visitScoreMap = new HashMap<>();
        for (String visitor : visitors) {
            if (friendSet.contains(visitor)) continue;
            visitScoreMap.put(visitor, visitScoreMap.getOrDefault(visitor, 0) + 1);
        }
        return visitScoreMap;
    }

}
