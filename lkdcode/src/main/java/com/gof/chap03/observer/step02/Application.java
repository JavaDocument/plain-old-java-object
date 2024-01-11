package com.gof.chap03.observer.step02;

class Application {
    public static void main(String[] args) {
        ConcreteSubject publisher = new ConcreteSubject();

        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        publisher.registerObserver(observerA);
        publisher.registerObserver(observerB);

        publisher.notifyObserver();
    }
}
