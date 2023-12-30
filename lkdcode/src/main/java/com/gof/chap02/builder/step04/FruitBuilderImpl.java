package com.gof.chap02.builder.step04;

class FruitBuilderImpl implements FruitBuilder {
    private FruitType fruitType;
    private double brix;

    @Override
    public void setFruitType(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    @Override
    public void setBrix(double brix) {
        this.brix = brix;
    }

    public Fruit create() {
        return new Fruit(this.fruitType, this.brix);
    }

}
