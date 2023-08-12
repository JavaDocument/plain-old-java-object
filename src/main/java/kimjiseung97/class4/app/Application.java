package kimjiseung97.class4.app;

import kimjiseung97.class4.app.domain.config.AppConfig;
import kimjiseung97.class4.app.domain.controller.FriendsListController;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        FriendsListController friendsListController = new FriendsListController();

        List<String> solution = friendsListController.solution();

        System.out.println(solution);


    }
}
