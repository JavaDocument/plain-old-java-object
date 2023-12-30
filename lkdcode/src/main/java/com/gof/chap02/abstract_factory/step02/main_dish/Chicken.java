package com.gof.chap02.abstract_factory.step02.main_dish;

public class Chicken implements MainDish {
    @Override
    public int getPrice() {
        return 20_000;
    }
    @Override
    public String toString() {
        return "Chicken : " + getPrice();
    }
}
