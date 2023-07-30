package lkdcode.class4.app;

import lkdcode.class4.app.domain.controller.SNSController;
import lkdcode.class4.app.domain.controller.request.FriendRequestDTO;
import lkdcode.class4.app.domain.controller.request.VisitorRequestDTO;
import lkdcode.class4.app.domain.service.SNSService;

public class Application {

    public static void main(String[] args) {

        String[][] friends = {{"donet", "andole"}, {"donet", "jun"},
                {"donut", "mrko"}, {"shakevan", "andole"},
                {"shakevan", "jun"}, {"shakevan", "mrko"}};
        String[] visitor = {"bedi", "bedi", "donut", "bedi", "shakevan"};

        FriendRequestDTO friendRequestDTO = new FriendRequestDTO(friends);
        VisitorRequestDTO visitorRequestDTO = new VisitorRequestDTO(visitor);

        SNSController snsController = new SNSController(null, friendRequestDTO, visitorRequestDTO);

    }

}
