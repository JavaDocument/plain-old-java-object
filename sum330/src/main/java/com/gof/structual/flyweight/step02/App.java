package com.gof.structual.flyweight.step02;

class App {

    public static void main(String[] args) {

        FontFactory fontFactory = new FontFactory();

        Character c1 = new Character('h', "white", fontFactory.getFont("Nanum:12"));
        System.out.println(c1.toString());

        Character c2 = new Character('e', "white", fontFactory.getFont("Nanum:12"));
        System.out.println(c2.toString());

        Character c3 = new Character('e', "white", fontFactory.getFont("Nanum:8"));
        System.out.println(c3.toString());
    }
}
