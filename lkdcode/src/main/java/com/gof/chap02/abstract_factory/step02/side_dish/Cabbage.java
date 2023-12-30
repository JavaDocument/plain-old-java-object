package com.gof.chap02.abstract_factory.step02.side_dish;

public class Cabbage implements SideDish {
    @Override
    public int getPrice() {
        return 4_500;
    }
    @Override
    public String toString() {
        return "Cabbage : " + getPrice();
    }
}
