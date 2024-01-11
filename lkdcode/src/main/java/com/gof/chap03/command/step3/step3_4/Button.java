package com.gof.chap03.command.step3.step3_4;

class Button {
    public void press(Command command) {
        command.execute();
    }
}
