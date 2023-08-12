package lkdcode.class4.app.domain.repository;

import lkdcode.class4.app.domain.user.PointType;

import java.util.List;

public interface SNSRepository {

    void addFriend(final String name, final PointType type);

    List<String> findAllByOrderByPointDesc();

}
