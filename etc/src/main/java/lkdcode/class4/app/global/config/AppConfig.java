package lkdcode.class4.app.global.config;

import lkdcode.class4.app.domain.controller.SNSController;
import lkdcode.class4.app.domain.controller.request.FriendRequestDTO;
import lkdcode.class4.app.domain.controller.request.VisitorRequestDTO;
import lkdcode.class4.app.domain.repository.RecommendedFriendsList;
import lkdcode.class4.app.domain.repository.SNSRepository;
import lkdcode.class4.app.domain.service.PointService;
import lkdcode.class4.app.domain.service.SNSService;

public class AppConfig {

    private final static String[][] FRIENDS = {{"donet", "andole"}, {"donet", "jun"},
            {"donut", "mrko"}, {"shakevan", "andole"},
            {"shakevan", "jun"}, {"shakevan", "mrko"}};
    private final static String[] VISITOR = {"bedi", "bedi", "donut", "bedi", "shakevan"};

    public static SNSController getSNSController() {
        return SNSController.of(pointService(), friendRequestDTO(), visitorRequestDTO());
    }

    private static SNSService pointService() {
        return new PointService(recommendedFriendsList());
    }

    private static SNSRepository recommendedFriendsList() {
        return new RecommendedFriendsList();
    }

    private static FriendRequestDTO friendRequestDTO() {
        return FriendRequestDTO.toDTO(FRIENDS);
    }

    private static VisitorRequestDTO visitorRequestDTO() {
        return VisitorRequestDTO.toDTO(VISITOR);
    }

}
