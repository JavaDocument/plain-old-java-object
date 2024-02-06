package com.gof.behavioral.memento;

class App {

    public static void main(String[] args) {

        PlayerStateCaretaker caretaker = new PlayerStateCaretaker();

        // 플레이어 초기 설정
        PlayerState playerState = new PlayerState("생존");
        System.out.println("플레이어의 현재 상태: " + playerState.getState());

        // 플레이어 상태 저장
        caretaker.addMemento(new PlayerStateMemento(playerState));

        // 플레이어 사망
        playerState = new PlayerState("사망");
        System.out.println("플레이어의 현재 상태: " + playerState.getState());

        // 이전 상태로 복원
        playerState = caretaker.getMemento(0).getState();
        System.out.println("플레이어의 현재 상태: " + playerState.getState());
    }
}
