package com.gof.chap03.prototype.step01;

class PrototypeA extends Prototype {
    private final String name;
    private final int age;

    public PrototypeA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public Prototype cloneObject() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
