package com.gof.behavioral.memento;

// 플레이어의 상태를 나타내는 클래스
class PlayerState {

    private String state;

    public PlayerState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
