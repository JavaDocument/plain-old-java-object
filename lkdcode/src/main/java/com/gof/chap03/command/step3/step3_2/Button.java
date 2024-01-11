package com.gof.chap03.command.step3.step3_2;

class Button {
    public void press(Alarm alarm) {
        alarm.goOff();
    }

    public void press(Lamp lamp) {
        lamp.turnOn();
    }

    // 새로운 기능이 추가될 때마다 코드를 수정해야 한다.
}
