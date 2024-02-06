package com.gof.chap07.visitor.step1;

class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void methodElementA() {
        System.out.println("ConcreteElementA.methodElementA");
    }
}
