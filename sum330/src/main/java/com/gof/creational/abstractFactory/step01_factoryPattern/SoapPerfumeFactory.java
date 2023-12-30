package com.gof.creational.abstractFactory.step01_factoryPattern;

class SoapPerfumeFactory implements PerfumeFactory {

    @Override
    public Perfume makePerfume() {
        return new SoapPerfume();
    }

    @Override
    public void order(String name) {
        System.out.println("[" + name + "] 을/를 주문 받았습니다!");
    }

    @Override
    public void customazing(String customazingName) {
        System.out.println("고객님의 요청에 의해 [" + customazingName + "] 으로 커스텀 중입니다!");
    }

    @Override
    public void delivery(String customazingName) {
        System.out.println("[" + customazingName + "] 을/를 배달하였습니다 ^0^");
    }
}
