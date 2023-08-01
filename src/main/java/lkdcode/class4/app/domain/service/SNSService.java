package lkdcode.class4.app.domain.service;

import lkdcode.class4.app.domain.controller.request.FriendRequestDTO;
import lkdcode.class4.app.domain.controller.request.VisitorRequestDTO;

import java.util.List;

public interface SNSService {

    List<String> getRecommendedList(final FriendRequestDTO friendRequestDTO, final VisitorRequestDTO visitorRequestDTO);

}
