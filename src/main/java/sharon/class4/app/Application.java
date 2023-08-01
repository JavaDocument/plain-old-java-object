package sharon.class4.app;

import sharon.class4.app.sns.controller.SnsController;

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

        String[] recommendedFriends = SnsController.recommendFriends(snsRegisteredFriends, visitor, loggedInUser);

        System.out.println("recommendedFriends = " + recommendedFriends);
    }

}
