package com.gof.behavioral.template.step02;

class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("찻잎 우려내는 중");
    }

    @Override
    void addConiments() {
        System.out.println("레몬 추가");
    }
}
