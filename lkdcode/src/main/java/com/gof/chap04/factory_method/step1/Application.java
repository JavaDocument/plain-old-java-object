package com.gof.chap04.factory_method.step1;

class Application {
    public static void main(String[] args) {
        final Factory factory = new 메이플공장();

        final Product p1 = factory.create("전사");
        final Product p2 = factory.create("법사");
        final Product p3 = factory.create("법사");
        final Product p4 = factory.create("법사");
        final Product p5 = factory.create("법사");

        p1.use();
        p2.use();
        p3.use();
        p4.use();
        p5.use();
    }
}
