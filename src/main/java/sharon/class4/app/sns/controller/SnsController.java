package sharon.class4.app.sns.controller;


import sharon.class4.app.sns.service.SnsService;

public class SnsController {

    private static SnsService snsService;

    public SnsController(SnsService snsService) {
        this.snsService = snsService;
    }

    public static String[] recommendFriends(String[][] snsRegisteredFriends, String[] visitor, String user) {
        return snsService.recommendFriends(snsRegisteredFriends, visitor, user);
    }
}
