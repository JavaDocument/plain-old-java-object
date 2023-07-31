package yewon.class4.app.Service;

import yewon.class4.app.entity.Point;
import yewon.class4.app.entity.User;

import java.util.*;

import static yewon.class4.app.common.ValueBounds.RECOMMEND_LENGTH_MAX;

public class RecommendFriendService {

    private Point point;

    public RecommendFriendService() {
        point = new Point(new HashMap<>());
    }

    public List<User> recommendFriends(User user, List<User> users) {
        List<User> topUsersByPoint = point.getTopUsersByPoint(user, users);
        if (topUsersByPoint.size() > RECOMMEND_LENGTH_MAX) {
            topUsersByPoint.subList(0, RECOMMEND_LENGTH_MAX);
        }
        return topUsersByPoint;
    }

}
