package com.gof.chap03.command.step3.step3_3;

class Lamp implements Command {
    @Override
    public void execute() {
        System.out.println("Lamp 가 켜졌습니다.");
    }
}
