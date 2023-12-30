package com.gof.chap02.abstract_factory.step02.fruit;

public class Tomato implements Fruit {
    @Override
    public int getPrice() {
        return 400;
    }
    @Override
    public String toString() {
        return "Tomato : " + getPrice();
    }
}

