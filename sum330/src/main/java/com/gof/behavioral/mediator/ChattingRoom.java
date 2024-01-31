package com.gof.behavioral.mediator;

class ChattingRoom implements ChatMediator{

    @Override
    public void sendMessage(String message, User user) {
        System.out.println(user.getName() + " : " + message);
    }
}
