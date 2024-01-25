package com.gof.behavioral.template.step02;

class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("필터로 커피 우려내는 중");
    }

    @Override
    void addConiments() {
        System.out.println("설탕과 우유 추가");
    }
}
