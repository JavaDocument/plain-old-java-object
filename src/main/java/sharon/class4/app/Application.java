package sharon.class4.app;

import sharon.class4.app.sns.controller.SnsController;
import sharon.class4.app.sns.service.SnsService;

public class Application {

    public static void main(String[] args) {

        String[][] snsRegisteredFriends = {
                {"donet", "andole"},
                {"donet", "jun"},
                {"donut", "mrko"},
                {"shakevan", "andole"},
                {"shakevan", "jun"},
                {"shakevan", "mrko"}};

        String[] visitor = {"bedi", "bedi", "donut", "bedi", "shakevan"};

        String loggedInUser = "mrko";

        SnsController snsController = new SnsController(new SnsService());
        String[] recommendedFriends = snsController.recommendFriends(snsRegisteredFriends, visitor, loggedInUser);

        for (String recommendedFriend : recommendedFriends) {
            System.out.println("recommendedFriend.toString() = " + recommendedFriend);
        }
    }

}
