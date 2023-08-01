package yewon.class4.app.io;

import yewon.class4.app.entity.User;

import java.util.List;

public class OutputHandlerImpl<T> implements OutputHandler<T> {

    private final StringBuilder sb;

    public OutputHandlerImpl() {
        this.sb = new StringBuilder();
    }

    @Override
    public void message(T message) {
        System.out.print(message);
    }

    @Override
    public void result(List<User> top5User) {
        sb.append("💕 추천친구").append(System.getProperty("line.separator"));
        for (User recommendFriend : top5User) {
            sb.append(recommendFriend.getName()).append(System.getProperty("line.separator"));
        }
        System.out.print(sb);
    }

}
