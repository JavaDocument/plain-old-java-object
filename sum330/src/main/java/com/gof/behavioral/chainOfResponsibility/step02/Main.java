package com.gof.behavioral.chainOfResponsibility.step02;

class Main {

    public static void main(String[] args) {

        Chain c1 = new NagativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();

        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new Number(90));
        c1.process(new Number(0));
        c1.process(new Number(-8));
    }
}
