package com.gof.behavioral.state;

class Off implements PowerState {

    @Override
    public PowerState pushButton() {
        System.out.println("전원이 켜졌습니다.");
        return new On();
    }
}
