package com.gof.behavioral.strategy;

class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    void display() {
        System.out.println("저는 천둥오리 입니다.");
    }
}
