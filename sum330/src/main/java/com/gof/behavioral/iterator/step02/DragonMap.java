package com.gof.behavioral.iterator.step02;

import java.util.HashMap;
import java.util.Map;

class DragonMap implements CustomIterator<Dragon> {

    private Map<String, Dragon> dragonMap = new HashMap<>();
    private int currentIndex = 0;

    public void addDragon(String key, Dragon dragon) {
        dragonMap.put(key, dragon);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Dragon getNext() {
        return null;
    }
}
