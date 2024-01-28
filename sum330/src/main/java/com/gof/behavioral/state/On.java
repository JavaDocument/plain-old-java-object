package com.gof.behavioral.state;

class On implements PowerState {

    @Override
    public PowerState pushButton() {
        System.out.println("전원이 꺼졌습니다.");
        return new Off();
    }
}
