package com.gof.behavioral.mediator;

class App {

    public static void main(String[] args) {
        ChatMediator katok = new ChattingRoom();

        User 기덕 = new User("기덕", katok);
        User 수민 = new User("수민", katok);

        기덕.sendMessage("수민아, 안녕");
        수민.sendMessage("오빠 메롱 ㅎㅎㅎ");
    }
}
