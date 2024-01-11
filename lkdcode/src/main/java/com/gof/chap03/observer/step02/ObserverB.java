package com.gof.chap03.observer.step02;

class ObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverB!");
    }
}
