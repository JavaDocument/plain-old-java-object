package com.gof.behavioral.visitor.step01;

import java.util.ArrayList;

class Cart implements Element{

    ArrayList<Element> cart = new ArrayList<>();

    public Cart() {
        cart.add(new Snack());
        cart.add(new Milk());
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("카트가 준비되었습니다.");
        visitor.visit(this);

        for (Element element : cart) {
            element.accept(visitor);
        }
    }
}
