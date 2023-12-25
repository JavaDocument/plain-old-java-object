package com.gof.chap01.iterator;

import java.util.HashMap;
import java.util.Map;

class FruitMap implements FruitIterator {

    private final Map<Integer, Fruit> map = new HashMap<>();
    private int keyIndex = 0;
    private int currentIndex = 0;

    public void addFruit(Fruit fruit) {
        this.map.put(this.keyIndex++, fruit);
    }

    @Override
    public boolean hasNextFruit() {
        return this.keyIndex > this.currentIndex;
    }

    @Override
    public Fruit getNextFruit() {
        if (hasNextFruit()) {
            return map.get(this.currentIndex++);
        }

        return null;
    }

    @Override
    public void resetCurrentIndex() {
        this.currentIndex = 0;
    }

}
