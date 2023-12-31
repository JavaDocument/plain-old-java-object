package com.gof.behavioral.strategy;

class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    void display() {
        System.out.println("저는 러버덕 입니다.");
    }
}
