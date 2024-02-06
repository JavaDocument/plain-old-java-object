package com.gof.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// 플레이어 상태를 저장하고 복원하는 클래스
class PlayerStateCaretaker {

    private final List<PlayerStateMemento> mementoList = new ArrayList<>();

    public void addMemento(PlayerStateMemento memento) {
        mementoList.add(memento);
    }

    public PlayerStateMemento getMemento(int index) {
        return mementoList.get(index);
    }
}
