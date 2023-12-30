package com.gof.chap01.iterator;

import java.util.ArrayList;
import java.util.List;

class FruitList implements FruitIterator {

    private final List<Fruit> list = new ArrayList<>();
    private int currentIndex = 0;

    public void addFruit(Fruit fruit) {
        this.list.add(fruit);
    }

    @Override
    public boolean hasNextFruit() {
        return this.list.size() > currentIndex;
    }

    @Override
    public Fruit getNextFruit() {
        if (hasNextFruit()) {
            return this.list.get(currentIndex++);
        }

        return null;
    }

    @Override
    public void resetCurrentIndex() {
        this.currentIndex = 0;
    }
}
