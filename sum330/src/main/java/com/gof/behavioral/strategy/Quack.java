package com.gof.behavioral.strategy;

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥꽥!");
    }
}
