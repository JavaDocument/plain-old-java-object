package lkdcode.class4.app;

import lkdcode.class4.app.domain.controller.SNSController;
import lkdcode.class4.app.global.config.AppConfig;

public class Application {

    public static void main(String[] args) {

        SNSController snsController = AppConfig.getSNSController();
        snsController.printRecommendedList();

    }

}
