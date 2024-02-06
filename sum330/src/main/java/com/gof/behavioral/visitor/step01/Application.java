package com.gof.behavioral.visitor.step01;

class Application {

    public static void main(String[] args) {
        Shopper shopper = new Shopper();
        Cart cart = new Cart();
        cart.accept(shopper);
    }
}
