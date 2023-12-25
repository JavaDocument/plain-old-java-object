package com.gof.chap01.iterator;

class Main {
    public static void main(String[] args) {

        FruitList fruitList = new FruitList();
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());
        fruitList.addFruit(new Banana());

        Printer.print(fruitList);
        System.out.println("\n=======================================\n");

        FruitArrays fruitArrays = new FruitArrays();
        fruitArrays.addFruit(new Apple());
        fruitArrays.addFruit(new Apple());
        fruitArrays.addFruit(new Apple());
        fruitArrays.addFruit(new Apple());
        fruitArrays.addFruit(new Apple());
        fruitArrays.addFruit(new Apple());
        fruitArrays.addFruit(new Apple());
        fruitArrays.addFruit(new Apple());
        fruitArrays.addFruit(new Apple());
        fruitArrays.addFruit(new Apple());

        Printer.print(fruitArrays);
        System.out.println("\n=======================================\n");

        FruitMap fruitMap = new FruitMap();
        fruitMap.addFruit(new Apple());
        fruitMap.addFruit(new Apple());
        fruitMap.addFruit(new Banana());
        fruitMap.addFruit(new Apple());
        fruitMap.addFruit(new Banana());
        fruitMap.addFruit(new Apple());
        fruitMap.addFruit(new Apple());
        fruitMap.addFruit(new Banana());
        fruitMap.addFruit(new Banana());
        fruitMap.addFruit(new Apple());
        fruitMap.addFruit(new Banana());
        fruitMap.addFruit(new Banana());
        fruitMap.addFruit(new Apple());

        Printer.print(fruitMap);
        System.out.println("\n=======================================\n");
    }
}
