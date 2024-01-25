package com.gof.structual.decorator;

class Main {

    public static void main(String[] args) {

        Yogurt yogurt1 = new Granola(new GreekYogurt());
        yogurt1.decorate();
        System.out.println("=======================");

        Yogurt yogurt2 = new Blueberry(new GreekYogurt());
        yogurt2.decorate();
        System.out.println("=======================");

        Yogurt yogurt3 = new Blueberry(new Granola(new GreekYogurt()));
        yogurt3.decorate();
    }
}
