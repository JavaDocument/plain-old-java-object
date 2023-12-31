package com.gof.behavioral.iterator.step02;

import java.util.ArrayList;
import java.util.List;

class DragonList implements CustomIterator<Dragon> {

    private final List<Dragon> dragonList = new ArrayList<>();
    private int currentIndex = 0;

    public void addDragon(Dragon dragon) {
        dragonList.add(dragon);
    }

    @Override
    public boolean hasNext() {
        return dragonList.size() > currentIndex;
    }

    @Override
    public Dragon getNext() {
        if (hasNext()) {
            return dragonList.get(currentIndex++);
        }
        return null;
    }
}
