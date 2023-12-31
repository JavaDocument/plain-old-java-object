package com.gof.creational.abstractFactory.step01_factoryPattern;

class Perfume {

    private String name;
    private Color color;

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

    @Override
    public String toString() {
        return "Perfume{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
