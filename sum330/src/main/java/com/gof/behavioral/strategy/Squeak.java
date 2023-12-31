package com.gof.behavioral.strategy;

class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("삑 삑");
    }
}
