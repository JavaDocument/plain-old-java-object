package lkdcode.class4.app.domain.repository;

import lkdcode.class4.app.domain.user.PointType;

import java.util.List;

public interface SNSRepository {

    void addFriend(String name, PointType type);

    List<String> getList();

}
