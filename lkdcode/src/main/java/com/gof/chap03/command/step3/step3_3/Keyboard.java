package com.gof.chap03.command.step3.step3_3;

class Keyboard implements Command {
    @Override
    public void execute() {
        System.out.println("키보드 실행!");
    }
}
