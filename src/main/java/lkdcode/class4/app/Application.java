package lkdcode.class4.app;

import lkdcode.class4.app.domain.controller.SNSController;
import lkdcode.class4.app.domain.friend.RecommendedFriendsList;
import lkdcode.class4.app.domain.service.PointService;

public class Application {
    public static void main(String[] args) {

        String[][] friends = {{"donet", "andole"}, {"donet", "jun"},
                {"donut", "mrko"}, {"shakevan", "andole"},
                {"shakevan", "jun"}, {"shakevan", "mrko"}};
        String[] visitor = {"bedi", "bedi", "donut", "bedi", "shakevan"};

        RecommendedFriendsList recommendedFriendsList = new RecommendedFriendsList();
        PointService pointService = new PointService(recommendedFriendsList, friends, visitor);

        SNSController snsController = new SNSController(pointService);
        snsController.calculator();

    }

}
