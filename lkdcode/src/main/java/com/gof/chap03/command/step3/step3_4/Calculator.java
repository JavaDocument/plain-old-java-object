package com.gof.chap03.command.step3.step3_4;

public class Calculator implements Command {
    @Override
    public void execute() {
        System.out.println("계산기 실행!");
    }
}
