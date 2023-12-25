package com.gof.chap01.iterator;

interface FruitIterator {

    boolean hasNextFruit();

    Fruit getNextFruit();

    void resetCurrentIndex();

}
