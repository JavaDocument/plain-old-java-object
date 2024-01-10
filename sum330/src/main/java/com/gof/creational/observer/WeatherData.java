package com.gof.creational.observer;

import java.util.ArrayList;
import java.util.List;

class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) { // 옵저버 등록
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) { // 옵저버 탈퇴
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) { // 모든 옵저버에게 상태변화 알려줌
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
