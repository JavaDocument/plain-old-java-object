package com.gof.chap03.command.step3.step3_4;

class Remote implements Command {
    @Override
    public void execute() {
        System.out.println("리모콘 실행!");
    }
}
