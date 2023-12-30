package com.gof.chap02.abstract_factory.step02.dessert;

public class Tart implements Dessert {
    @Override
    public int getPrice() {
        return 2_000;
    }

    @Override
    public String toString() {
        return "Tart : " + getPrice();
    }
}
