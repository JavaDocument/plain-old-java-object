package com.gof.chap04.factory_method.step1;

class 법사 extends Product {
    @Override
    public void use() {
        System.out.println("법사임" + this);
    }
}
