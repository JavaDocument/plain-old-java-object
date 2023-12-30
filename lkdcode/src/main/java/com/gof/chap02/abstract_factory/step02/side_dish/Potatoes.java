package com.gof.chap02.abstract_factory.step02.side_dish;

public class Potatoes implements SideDish {
    @Override
    public int getPrice() {
        return 6_500;
    }
    @Override
    public String toString() {
        return "Potatoes : " + getPrice();
    }
}

