package com.gof.chap02.builder.step04;

class FruitDirector {

    public void constructTomato(FruitBuilder fruitBuilder) {
        fruitBuilder.setFruitType(FruitType.TOMATO);
        fruitBuilder.setBrix(15.0);
    }

    public void constructBanana(FruitBuilder fruitBuilder) {
        fruitBuilder.setFruitType(FruitType.BANANA);
        fruitBuilder.setBrix(16.0);
    }

}
