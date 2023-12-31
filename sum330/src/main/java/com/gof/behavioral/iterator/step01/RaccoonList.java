package com.gof.behavioral.iterator.step01;

import java.util.ArrayList;
import java.util.List;

public class RaccoonList implements CustomIterator<Raccoon> {

    private final List<Raccoon> raccoonList = new ArrayList<>();
    private int currentIndex = 0;

    public void addRaccoon(Raccoon raccoon) {
        raccoonList.add(raccoon);
    }

    @Override
    public boolean hasNext() {
        return raccoonList.size() > currentIndex;
    }

    @Override
    public Raccoon getNext() {
        if (hasNext()) {
            return raccoonList.get(currentIndex++);
        }
        return null;
    }

}
