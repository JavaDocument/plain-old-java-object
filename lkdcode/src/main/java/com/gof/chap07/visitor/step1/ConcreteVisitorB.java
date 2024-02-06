package com.gof.chap07.visitor.step1;

class ConcreteVisitorB implements Visitor {


    @Override
    public void visit(Element element) {
        System.out.println("ConcreteVisitorB.visit.start");
        System.out.println(element.getClass().getSimpleName() + " do something........ ");
        System.out.println("ConcreteVisitorB.visit.end");
    }
}
