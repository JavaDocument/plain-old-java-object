package com.gof.creational.factoryMethod.step01;

class Main {

    public static void main(String[] args) {

        KimchiFactory kimchiFactory = new KimchiFactory();
        Kimchizzim kimchi = kimchiFactory.createKimchizzim();
        kimchi.print();

        PorkFactory porkFactory = new PorkFactory();
        Kimchizzim pork = porkFactory.createKimchizzim();
        pork.print();
    }
}
