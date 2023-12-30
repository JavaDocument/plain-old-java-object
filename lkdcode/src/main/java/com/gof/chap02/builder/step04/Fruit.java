package com.gof.chap02.builder.step04;

class Fruit {

    private final FruitType fruitType;
    private final double brix;

    public Fruit(FruitType fruitType, double brix) {
        this.fruitType = fruitType;
        this.brix = brix;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public double getBrix() {
        return brix;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitType=" + fruitType +
                ", brix=" + brix +
                '}';
    }
}
