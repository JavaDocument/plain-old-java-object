package com.gof.chap02.abstract_factory.step02.fruit;

public class Banana implements Fruit {
    @Override
    public int getPrice() {
        return 700;
    }
    @Override
    public String toString() {
        return "Banana : " + getPrice();
    }
}

