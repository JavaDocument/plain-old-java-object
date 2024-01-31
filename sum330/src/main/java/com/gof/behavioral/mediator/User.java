package com.gof.behavioral.mediator;

class User {

    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String message) {
        chatMediator.sendMessage(message, this);
    }

    public String getName() {
        return name;
    }
}
