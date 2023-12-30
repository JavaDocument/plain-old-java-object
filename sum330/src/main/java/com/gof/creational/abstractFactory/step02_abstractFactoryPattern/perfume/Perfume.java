package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.bottle.Bottle;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.cap.Cap;

public class Perfume {

    private String name;
    private Color color;
    private Bottle bottle;
    private Cap cap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Bottle getBottle() {
        return bottle;
    }

    public void setBottle(Bottle bottle) {
        this.bottle = bottle;
    }

    public Cap getCap() {
        return cap;
    }

    public void setCap(Cap cap) {
        this.cap = cap;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", bottle=" + bottle +
                ", cap=" + cap +
                '}';
    }
}
