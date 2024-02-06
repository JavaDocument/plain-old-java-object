package com.gof.behavioral.visitor.step01;

class Snack implements Element{

    @Override
    public void accept(Visitor visitor) {
        System.out.println("과자가 준비되었습니다.");
        visitor.visit(this);
    }
}
