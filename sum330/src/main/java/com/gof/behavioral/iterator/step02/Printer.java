package com.gof.behavioral.iterator.step02;

class Printer {

    public void print(CustomIterator<Dragon> iterator) {
        while (iterator.hasNext()) {
            Dragon dragon = iterator.getNext();
            System.out.println(dragon);
        }
    }
}
