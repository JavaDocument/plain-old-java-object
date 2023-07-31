package lkdcode.class4.app.domain.controller;

import lkdcode.class4.app.domain.controller.request.FriendRequestDTO;
import lkdcode.class4.app.domain.controller.request.VisitorRequestDTO;
import lkdcode.class4.app.domain.service.SNSService;

import java.util.List;

public class SNSController {

    private final SNSService pointService;
    private final FriendRequestDTO friendRequestDTO;
    private final VisitorRequestDTO visitorRequestDTO;

    public SNSController(final SNSService pointService, final FriendRequestDTO friendRequestDTO, final VisitorRequestDTO visitorRequestDTO) {
        this.pointService = pointService;
        this.friendRequestDTO = friendRequestDTO;
        this.visitorRequestDTO = visitorRequestDTO;
    }

    public void getRecommendedList() {
        List<String> recommendedList = pointService.getRecommendedList(friendRequestDTO, visitorRequestDTO);
        System.out.println(recommendedList);
    }

}
