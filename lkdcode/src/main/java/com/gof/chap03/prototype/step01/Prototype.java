package com.gof.chap03.prototype.step01;

abstract class Prototype implements Cloneable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract Object cloneObject();
}
