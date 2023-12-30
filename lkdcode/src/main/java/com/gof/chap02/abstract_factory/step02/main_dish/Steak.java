package com.gof.chap02.abstract_factory.step02.main_dish;

public class Steak implements MainDish {
    @Override
    public int getPrice() {
        return 35_000;
    }
    @Override
    public String toString() {
        return "Steak : " + getPrice();
    }
}
