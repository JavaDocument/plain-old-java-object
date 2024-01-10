package com.gof.behavioral.command.step01;

class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPreseed() {
        slot.execute();
    }
}
