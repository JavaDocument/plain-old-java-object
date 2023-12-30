package com.gof.chap01.iterator;

class Printer {

    private Printer() {
    }

    public static void print(FruitIterator fruitIterator) {
        int index = 1;
        while (fruitIterator.hasNextFruit()) {
            Fruit fruit = fruitIterator.getNextFruit();
            System.out.println(index++ + ". 수확한 과일 : " + fruit.getClass().getSimpleName() + " , 바코드 : " + fruit.getCode());
        }
    }

}
