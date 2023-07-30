package lkdcode.class4.app.domain.service;

import lkdcode.class4.app.domain.controller.request.FriendRequestDTO;
import lkdcode.class4.app.domain.controller.request.VisitorRequestDTO;
import lkdcode.class4.app.domain.repository.SNSRepository;
import lkdcode.class4.app.domain.user.PointType;
import lkdcode.class4.app.domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class PointService implements SNSService {

    private final SNSRepository recommendedFriendsList;
    private final List<String> knownFriends;

    public PointService(final SNSRepository recommendedFriendsList) {
        this.recommendedFriendsList = recommendedFriendsList;
        this.knownFriends = new ArrayList<>();
    }

    @Override
    public List<String> getRecommendedList(FriendRequestDTO friendRequestDTO, VisitorRequestDTO visitorRequestDTO) {
        return recommendedFriendsList.getList();
    }

    public void calculatorKnownFriends(FriendRequestDTO dto) {
        List<String[]> friendList = dto.getFriendList();
        for (int i = 0; i < friendList.size(); i++) {
            String[] list = friendList.get(i);
            if (list[0].equals(User.name)) {
                dto.delete(i);
                knownFriends.add(list[1]);
            }

            if (list[1].equals(User.name)) {
                dto.delete(i);
                knownFriends.add(list[0]);
            }
        }

        checkFriendOfFriend(dto);
    }

    public void calculatorVisitorList(VisitorRequestDTO dto) {
        List<String> visitorList = dto.getVisitorList();

        for (String name : visitorList) {
            recommendedFriendsList.addFriend(name, PointType.VISITOR);
        }
    }

    private void checkFriendOfFriend(FriendRequestDTO dto) {
        List<String[]> friendList = dto.getFriendList();
        for (String[] list : friendList) {
            String firstName = list[0];
            String secondName = list[1];
            for (String knownFriend : knownFriends) {
                if (firstName.equals(knownFriend)) {
                    recommendedFriendsList.addFriend(secondName, PointType.FRIEND);
                }

                if (secondName.equals(knownFriend)) {
                    recommendedFriendsList.addFriend(firstName, PointType.FRIEND);
                }
            }
        }
    }

}
