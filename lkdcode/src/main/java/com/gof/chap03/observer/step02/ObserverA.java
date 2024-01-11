package com.gof.chap03.observer.step02;

class ObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverA!");
    }
}
