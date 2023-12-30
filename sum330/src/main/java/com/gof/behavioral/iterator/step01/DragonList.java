package com.gof.behavioral.iterator.step01;

import java.util.List;

public class DragonList implements CustomIterator<Dragon>{
    List<Dragon> dragonList;

    @Override
    public Dragon getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
