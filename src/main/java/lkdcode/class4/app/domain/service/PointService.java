package lkdcode.class4.app.domain.service;

import lkdcode.class4.app.domain.friend.RecommendedFriendsList;
import lkdcode.class4.app.domain.user.User;

import static lkdcode.class4.app.domain.user.PointType.*;

public class PointService {

    private final RecommendedFriendsList recommendedFriendsList;
    private final String[][] friendList;
    private final String[] visitorList;

    public PointService(RecommendedFriendsList recommendedFriendsList, String[][] friendList, String[] visitorList) {
        this.recommendedFriendsList = recommendedFriendsList;
        this.friendList = friendList;
        this.visitorList = visitorList;
    }

    public void calculatorFriendList() {
        for (String[] friends : friendList) {

            if (friends[0].equals(User.name)) {
                System.out.println(friends[1] + "----------------");
                recommendedFriendsList.addFriend(friends[1], FRIEND);
            }

            if (friends[1].equals(User.name)) {
                System.out.println(friends[0] + "----------------");
                recommendedFriendsList.addFriend(friends[0], FRIEND);
            }

        }
    }

    public void calculatorVisitorList() {
        for (String name : visitorList) {
            recommendedFriendsList.addFriend(name, VISITOR);
        }
    }

    public void showList() {
        System.out.println(recommendedFriendsList.getList());
    }

}
