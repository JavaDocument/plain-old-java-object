package com.gof.chap03.command.step3.step3_3;

class Button {
    public void press(Command command) {
        command.execute();
    }
}
