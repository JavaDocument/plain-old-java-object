package com.gof.chap03.command.step3.step3_4;

class Alarm implements Command {
    @Override
    public void execute() {
        System.out.println("Alarm 이 울렸습니다.");
    }
}
