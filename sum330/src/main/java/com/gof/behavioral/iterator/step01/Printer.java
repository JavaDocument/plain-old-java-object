package com.gof.behavioral.iterator.step01;

public class Printer {

    public void print(CustomIterator<Dragon> iterator) {
        while (iterator.hasNext()) {
            Dragon dragon = iterator.getNext();
            System.out.println(dragon);
        }
    }

}
