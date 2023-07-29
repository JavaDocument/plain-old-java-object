package lkdcode.class4.app.domain.controller;

import lkdcode.class4.app.domain.service.SNSService;

public class SNSController {

    private final SNSService pointService;

    public SNSController(final SNSService pointService) {
        this.pointService = pointService;
    }

}
