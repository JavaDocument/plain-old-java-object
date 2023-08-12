package jhlee.class4.app.entity;

import java.util.*;

public class FriendsGraph {

    Map<String, Set<String>> friendGraph;

    private FriendsGraph(List<Friends> friends) {
        makeGraph(friends);
    }

    private void makeGraph(List<Friends> friends) {
        friendGraph = new HashMap<>();
        for (Friends friend : friends) {
            String friend1 = friend.friend1();
            String friend2 = friend.friend2();
            addFriendRelationToGraph(friend1, friend2);
            addFriendRelationToGraph(friend2, friend1);
        }
    }

    private void addFriendRelationToGraph(String friend1, String friend2) {
        Set<String> friendSet = friendGraph.getOrDefault(friend1, new HashSet<>());
        friendSet.add(friend2);
        friendGraph.put(friend1, friendSet);
    }

    public static FriendsGraph of(List<Friends> friends) {
        return new FriendsGraph(friends);
    }

    public Map<String, Integer> calculateCommonFriendScoreMap(String user) {
        Set<String> userFriendSet = friendGraph.get(user);
        Map<String, Integer> recommendMap = new HashMap<>();
        for (String friend : userFriendSet) {
            Set<String> friendsFriendSet = friendGraph.get(friend);
            for (String recommendFriend : friendsFriendSet) {
                if (recommendFriend.equals(user)) break;
                recommendMap.put(recommendFriend, recommendMap.getOrDefault(recommendFriend, 0) + 10);
            }
        }
        return recommendMap;
    }

    public Set<String> getFriendSet(String user) {
        return friendGraph.get(user);
    }
}
