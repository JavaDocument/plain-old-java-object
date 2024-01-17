package com.gof.chap04.factory_method.step1;

class 전사 extends Product {
    @Override
    public void use() {
        System.out.println("전사임" + this);
    }
}
