package com.gof.chap03.observer.step02;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private final List<Observer> list = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        this.list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        this.list.forEach(Observer::update);
    }
}
