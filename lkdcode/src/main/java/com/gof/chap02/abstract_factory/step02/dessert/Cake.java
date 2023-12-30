package com.gof.chap02.abstract_factory.step02.dessert;

public class Cake implements Dessert {
    @Override
    public int getPrice() {
        return 1_000;
    }

    @Override
    public String toString() {
        return "Cake : " + getPrice();
    }
}
