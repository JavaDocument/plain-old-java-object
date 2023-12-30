package com.gof.chap02.abstract_factory.step02.side_dish;

public class Rice implements SideDish {
    @Override
    public int getPrice() {
        return 1_000;
    }

    @Override
    public String toString() {
        return "Rice : " + getPrice();
    }
}
