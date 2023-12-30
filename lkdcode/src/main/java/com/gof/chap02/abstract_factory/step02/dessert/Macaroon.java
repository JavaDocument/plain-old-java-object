package com.gof.chap02.abstract_factory.step02.dessert;

public class Macaroon implements Dessert {
    @Override
    public int getPrice() {
        return 1_500;
    }

    @Override
    public String toString() {
        return "Macaroon : " + getPrice();
    }
}
