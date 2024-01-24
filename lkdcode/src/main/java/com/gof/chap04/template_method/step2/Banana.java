package com.gof.chap04.template_method.step2;

class Banana extends Item {

    private final Double price;

    public Banana(Double price) {
        this.price = price;
    }

    @Override
    protected Double price() {
        return this.price;
    }

}
