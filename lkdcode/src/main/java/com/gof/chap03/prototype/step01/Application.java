package com.gof.chap03.prototype.step01;

class Application {
    public static void main(String[] args) {
        PrototypeA prototypeA = new PrototypeA("myName", 30);

        Prototype prototype1 = prototypeA.cloneObject();
        Prototype prototype2 = prototypeA.cloneObject();
        Prototype prototype3 = prototypeA.cloneObject();
        Prototype prototype4 = prototypeA.cloneObject();

        System.out.println(prototype1.getName() + "  " + prototype1.getAge());
        System.out.println(prototype2.getName() + "  " + prototype2.getAge());
        System.out.println(prototype3.getName() + "  " + prototype3.getAge());
        System.out.println(prototype4.getName() + "  " + prototype4.getAge());
        System.out.println(prototypeA.getName() + "  " + prototypeA.getAge());
    }
}
