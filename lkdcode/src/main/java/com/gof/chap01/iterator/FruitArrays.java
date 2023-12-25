package com.gof.chap01.iterator;

import java.util.Arrays;

class FruitArrays implements FruitIterator {

    private static final int INITIAL_SIZE = 10;
    private Fruit[] arrays = new Fruit[INITIAL_SIZE];
    private int addIndex = 0;
    private int currentIndex = 0;

    public void addFruit(Fruit fruit) {
        checkSize();
        arrays[addIndex++] = fruit;
    }

    private void checkSize() {
        if (addIndex >= arrays.length) {
            this.arrays = Arrays.copyOf(this.arrays, arrays.length * 2);
        }
    }

    @Override
    public boolean hasNextFruit() {
        return this.addIndex > this.currentIndex;
    }

    @Override
    public Fruit getNextFruit() {
        if (hasNextFruit()) {
            return this.arrays[currentIndex++];
        }
        return null;
    }

    @Override
    public void resetCurrentIndex() {
        this.currentIndex = 0;
    }

}
