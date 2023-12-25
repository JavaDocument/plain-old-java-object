package com.gof.chap01.iterator;

class Apple implements Fruit {

    private final int code = this.hashCode();

    @Override
    public Fruit getFruit() {
        return this;
    }

    @Override
    public int getCode() {
        return this.code;
    }

}
