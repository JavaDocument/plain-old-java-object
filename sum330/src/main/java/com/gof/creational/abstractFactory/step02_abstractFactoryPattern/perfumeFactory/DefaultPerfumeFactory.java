package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfumeFactory;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume.Perfume;

public class DefaultPerfumeFactory implements PerfumeFactory {

    @Override
    public Perfume makePerfume() {
        return null;
    }

    @Override
    public void order(String name) {
        System.out.println("[" + name + "] 을/를 주문 받았습니다!");
    }

    @Override
    public void customazing(String customName) {
        System.out.println("고객님의 요청에 의해 [" + customName + "] 으로 커스텀 중입니다!");
    }

    @Override
    public void delivery(String customName) {
        System.out.println("[" + customName + "] 을/를 배달하였습니다 ^0^");
    }
}
