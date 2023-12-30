package com.gof.behavioral.iterator.step01;

public interface CustomIterator<T> {
    T getNext();

    boolean hasNext();
}
