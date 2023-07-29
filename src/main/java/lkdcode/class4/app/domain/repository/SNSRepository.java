package lkdcode.class4.app.domain.repository;

import lkdcode.class4.app.domain.user.PointType;

public interface SNSRepository<T> {

    void addFriend(String name, PointType type);

    T getList();

}
