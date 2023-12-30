package com.gof.chap02.abstract_factory.step02.main_dish;

public class Pasta implements MainDish {
    @Override
    public int getPrice() {
        return 18_000;
    }
    @Override
    public String toString() {
        return "Pasta : " + getPrice();
    }
}
