package com.gof.chap07.visitor.step1;

class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void methodElementB() {
        System.out.println("ConcreteElementB.methodB");
    }
}
