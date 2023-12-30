package com.gof.chap02.abstract_factory.step02.fruit;

public class Apple implements Fruit {
    @Override
    public int getPrice() {
        return 800;
    }
    @Override
    public String toString() {
        return "Apple : " + getPrice();
    }
}
