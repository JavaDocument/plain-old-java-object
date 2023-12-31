package com.gof.behavioral.iterator.step02;

class Main {

    public static void main(String[] args) {

        DragonList dragonList = new DragonList();
        DragonArrays dragonArrays = new DragonArrays();
        DragonMap dragonMap = new DragonMap();

        dragonList.addDragon(new Dragon("드래곤 1", Gender.MALE));
        dragonList.addDragon(new Dragon("드래곤 2", Gender.MALE));
        dragonList.addDragon(new Dragon("드래곤 3", Gender.MALE));

        dragonArrays.addDragon(new Dragon("드래곤 4", Gender.FEMALE));
        dragonArrays.addDragon(new Dragon("드래곤 5", Gender.FEMALE));
        dragonArrays.addDragon(new Dragon("드래곤 6", Gender.FEMALE));

        Printer printer = new Printer();
        printer.print(dragonList);
        printer.print(dragonArrays);
        printer.print(dragonMap);
    }
}
