package com.gof.creational.singleton.step02;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = Factory.getInstance().getSingletonType1();
        Cat cat2= Factory.getInstance().getSingletonType1();
        Cat cat3 = Factory.getInstance().getSingletonType1();

        Dog dog1 = Factory.getInstance().getSingletonType2();
        Dog dog2 = Factory.getInstance().getSingletonType2();
        Dog dog3 = Factory.getInstance().getSingletonType2();

        Dragon dragon1 = Factory.getInstance().getSingletonType3();
        Dragon dragon2 = Factory.getInstance().getSingletonType3();
        Dragon dragon3 = Factory.getInstance().getSingletonType3();

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
    }
}
