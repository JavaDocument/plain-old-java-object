package com.gof.behavioral.strategy;

class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("날 수 없어요");
    }
}
