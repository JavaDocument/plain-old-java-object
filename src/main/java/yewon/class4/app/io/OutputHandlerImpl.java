package yewon.class4.app.io;

import yewon.class4.app.entity.User;

import java.util.List;

public class OutputHandlerImpl<T> implements OutputHandler<T> {

    StringBuilder sb = new StringBuilder();

    @Override
    public void message(T message) {
        System.out.print(message);
    }

    @Override
    public void result(List<User> top5User) {
        sb.append("💕 추천친구" + "\n");
        for (User recommendFriend : top5User) {
            sb.append(recommendFriend.getName() + "\n");
        }
        System.out.print(sb);
    }

}
