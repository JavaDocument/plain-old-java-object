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
        calculatorKnownFriends(friendRequestDTO);
        calculatorVisitorList(visitorRequestDTO);

        return recommendedFriendsList.findAllByOrderByPointDesc();
    }

    private void calculatorKnownFriends(FriendRequestDTO dto) {
        List<String[]> friendList = dto.getFriendList();

        for (String[] list : friendList) {
            checkKnwonFriends(list);
        }

        checkFriendOfFriend(dto);
    }

    private void checkKnwonFriends(String[] list) {
        String firstName = list[0];
        String secondName = list[1];

        if (firstName.equals(User.name)) {
            knownFriends.add(secondName);
        }

        if (secondName.equals(User.name)) {
            knownFriends.add(firstName);
        }
    }

    private void calculatorVisitorList(VisitorRequestDTO dto) {
        List<String> visitorList = dto.getVisitorList();

        for (int i = 0; i < visitorList.size(); i++) {
            String checkName = visitorList.get(i);
            if (knownFriends.contains(checkName)) {
                visitorList.remove(i);
                i--;
            }
        }

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
                if (firstName.equals(knownFriend) && !secondName.equals(User.name)) {
                    recommendedFriendsList.addFriend(secondName, PointType.FRIEND);
                }

                if (secondName.equals(knownFriend) && !firstName.equals(User.name)) {
                    recommendedFriendsList.addFriend(firstName, PointType.FRIEND);
                }
            }

        }
    }

}
