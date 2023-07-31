package yewon.class4.app.entity;

import java.util.*;

import static yewon.class4.app.common.ValueBounds.*;

public class Point {
    private Map<User, Integer> point;

    public Point(Map<User, Integer> point) {
        this.point = point;
    }

    public List<User> getTopUsersByPoint(User user, List<User> users) {
        addPointByFriend(user, users);
        addPointByVisitor(user);

        List<User> topUsersByPoint = removeZeroPointUser();

        // 내림차순 정렬
        if (point.size() != 0) {
            Collections.sort(topUsersByPoint, (v1, v2) -> (point.get(v2).compareTo(point.get(v1))));
        }
        return topUsersByPoint;
    }
    
    private List<User> removeZeroPointUser() {
        List<User> users = new ArrayList<>(point.keySet());
        for (User user : users) {
            if (point.get(user) == 0) {
                users.remove(user);
            }
        }
        return users;
    }

    // TODO : 리팩터링
    private void addPointByFriend(User user, List<User> users) {
        for (User userFriend : user.getFriends()) {
            for (User otherUser : users) {
                if (otherUser.getName().equals(user.getName())) continue;
                for (User otherUserFriend : otherUser.getFriends()) {
                    if (otherUserFriend.getName().equals(userFriend.getName())) {
                        point.put(otherUser, point.getOrDefault(user, 0) + POINT_UP_BY_FRIEND);
                    }
                }
            }
        }
    }

    private void addPointByVisitor(User user) {
        for (User visitor : user.getVisitors()) {
            point.put(visitor, point.getOrDefault(visitor, 0) + POINT_UP_BY_VISITOR);
        }
    }
}
