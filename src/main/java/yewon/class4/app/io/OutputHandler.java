package yewon.class4.app.io;

import yewon.class4.app.entity.User;

import java.util.List;

public interface OutputHandler<T> {

    void message(T message);

    void result(List<User> top5User);
}
