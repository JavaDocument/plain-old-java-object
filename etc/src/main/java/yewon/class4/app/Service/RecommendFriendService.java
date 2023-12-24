package yewon.class4.app.Service;

import yewon.class4.app.domain.Point;
import yewon.class4.app.domain.User;
import yewon.class4.app.domain.UserList;

import java.util.*;

import static yewon.class4.app.common.ValueBounds.RECOMMEND_LENGTH_MAX;

public class RecommendFriendService {

    private Point point;

    public RecommendFriendService() {
        point = new Point();
    }

    public List<User> recommendFriends(User user, UserList users) {
        List<User> recommendationList = point.getTopUsersByPoint(user, users);

        recommendationList = removeMe(user, recommendationList);
        recommendationList = removeKnownFriend(user, recommendationList);

        if (recommendationList.size() > RECOMMEND_LENGTH_MAX) {
            recommendationList = recommendationList.subList(0, RECOMMEND_LENGTH_MAX);
        }
        return recommendationList;
    }

    private List<User> removeMe(User me, List<User> recommendationList) {
        for (User user : recommendationList) {
            if (user.getName().equals(me.getName())) {
                recommendationList.remove(me);
            }
        }
        return recommendationList;
    }

    private List<User> removeKnownFriend(User me, List<User> recommendationList) {
        for (User recommendationFriend : recommendationList) {
            for (User knownFriend : me.getFriends()) {
                if (recommendationFriend.getName().equals(knownFriend.getName())) {
                    recommendationList.remove(recommendationFriend);
                }
            }
        }
        return recommendationList;
    }

}
