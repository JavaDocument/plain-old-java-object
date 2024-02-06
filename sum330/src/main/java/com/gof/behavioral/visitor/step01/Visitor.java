package com.gof.behavioral.visitor.step01;

interface Visitor {

    void visit(Cart cart);
    void visit(Milk milk);
    void visit(Snack snack);
}
