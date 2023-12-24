package lkdcode.class4.app.domain.controller;

import lkdcode.class4.app.domain.controller.request.FriendRequestDTO;
import lkdcode.class4.app.domain.controller.request.VisitorRequestDTO;
import lkdcode.class4.app.domain.service.SNSService;

import java.util.List;

public class SNSController {

    private final SNSService pointService;
    private final FriendRequestDTO friendRequestDTO;
    private final VisitorRequestDTO visitorRequestDTO;

    private SNSController(final SNSService pointService, final FriendRequestDTO friendRequestDTO, final VisitorRequestDTO visitorRequestDTO) {
        this.pointService = pointService;
        this.friendRequestDTO = friendRequestDTO;
        this.visitorRequestDTO = visitorRequestDTO;
    }

    public static SNSController of(final SNSService snsService, final FriendRequestDTO friendRequestDTO, final VisitorRequestDTO visitorRequestDTO) {
        return new SNSController(snsService, friendRequestDTO, visitorRequestDTO);
    }

    public void printRecommendedList() {
        List<String> recommendedList = pointService.getRecommendedList(friendRequestDTO, visitorRequestDTO);
        System.out.println(recommendedList);
    }

}
