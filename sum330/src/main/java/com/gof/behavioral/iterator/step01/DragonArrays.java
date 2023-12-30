package com.gof.behavioral.iterator.step01;

public class DragonArrays implements CustomIterator<Dragon> {

    private Dragon[] arrays;

    @Override
    public Dragon getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
