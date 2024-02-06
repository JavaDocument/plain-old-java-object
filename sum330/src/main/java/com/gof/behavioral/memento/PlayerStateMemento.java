package com.gof.behavioral.memento;

// 플레이어의 상태를 저장하는 클래스
class PlayerStateMemento {

    private final PlayerState state;

    public PlayerStateMemento(PlayerState state) {
        this.state = state;
    }

    public PlayerState getState() {
        return state;
    }
}
