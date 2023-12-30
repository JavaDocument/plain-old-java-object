package com.gof.behavioral.iterator.step01;

import java.util.Map;

public class DragonMap implements CustomIterator<Dragon>{
    private Map<Integer,Dragon> map;

    @Override
    public Dragon getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
