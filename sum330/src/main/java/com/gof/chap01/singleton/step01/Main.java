package com.gof.chap01.singleton.step01;

public class Main {

    public static void main(String[] args) {

        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();
        Dragon dragon3 = new Dragon();

        DragonToothless toothless1 = DragonToothless.getToothless();
        DragonToothless toothless2 = DragonToothless.getToothless();
        DragonToothless toothless3 = DragonToothless.getToothless();

        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
        System.out.println(toothless1);
        System.out.println(toothless2);
        System.out.println(toothless3);
    }
}
