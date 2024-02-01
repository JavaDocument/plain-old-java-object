package com.gof.chap06.chain_of_responsibilty.generic;


public class Banana extends Apple {

}

class Kiwi extends Apple {

}

class Pineapple {

}

class APp {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.e1(new Banana());
        apple.e1(new Kiwi());
        apple.e1(new Pineapple());
        System.out.println("===========");

        apple.e2(Apple.class);
        apple.e2(Banana.class);


//        apple.e3(Pineapple.class);

    }
}