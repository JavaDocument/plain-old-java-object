package com.gof.chap07.visitor.step1;

class Application {
    public static void main(String[] args) {
        ConcreteElementA concreteElementA = new ConcreteElementA();
        ConcreteElementB concreteElementB = new ConcreteElementB();

        ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
        ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();

        concreteVisitorA.visit(concreteElementA);
        concreteVisitorA.visit(concreteElementB);
        System.out.println("-----------------------------------");

        concreteVisitorB.visit(concreteElementA);
        concreteVisitorB.visit(concreteElementB);
        System.out.println("-----------------------------------");
    }
}
