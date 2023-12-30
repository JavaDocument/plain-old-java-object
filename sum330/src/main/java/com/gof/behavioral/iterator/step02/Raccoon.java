package com.gof.behavioral.iterator.step02;

public class Raccoon {

    private String name;
    private int age;

    public Raccoon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Raccoon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
