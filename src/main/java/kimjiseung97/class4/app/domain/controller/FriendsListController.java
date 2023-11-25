package kimjiseung97.class4.app.domain.controller;

import kimjiseung97.class4.app.domain.config.AppConfig;
import kimjiseung97.class4.app.domain.service.AppService;

import java.util.List;

public class FriendsListController {

    private static AppConfig appConfig;

    private static AppService appService;



    public FriendsListController() {
        appService = new AppService();
        appConfig = new AppConfig();
    }

    public List<String> solution() {

        return appService.solution(appConfig);
    }


}
