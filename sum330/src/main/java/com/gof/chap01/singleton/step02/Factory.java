package com.gof.chap01.singleton.step02;

public class Factory implements Singleton<Cat, Dog, Dragon> {

    private static Factory factory = new Factory();
    private Cat cat;
    private Dog dog;
    private Dragon dragon;

    private Factory() {
    }

    public static Factory getInstance() {
        return factory;
    }

    @Override
    public Cat getSingletonType1() {
        if (cat == null) this.cat = new Cat();
        return this.cat;
    }

    @Override
    public Dog getSingletonType2() {
        if (dog == null) dog = new Dog();
        return dog;
    }

    @Override
    public Dragon getSingletonType3() {
        if (dragon == null) this.dragon = new Dragon();
        return dragon;
    }
}
