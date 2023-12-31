package com.gof.behavioral.strategy;

class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날 수 있어요!");
    }
}
