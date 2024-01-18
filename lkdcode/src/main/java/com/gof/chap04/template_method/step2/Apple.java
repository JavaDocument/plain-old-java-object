package com.gof.chap04.template_method.step2;

class Apple extends Item {

    private final Double price;

    public Apple(Double price) {
        this.price = price;
    }

    @Override
    protected Double price() {
        return this.price;
    }

}
