package com.gof.behavioral.iterator.step01;

public class Main {
    public static void main(String[] args) {
        DragonArrays dragonArrays = new DragonArrays();
        DragonList dragonList = new DragonList();
        DragonMap dragonMap = new DragonMap();

        //

        Printer printer = new Printer();
        printer.print(dragonArrays);
        printer.print(dragonList);
        printer.print(dragonMap);
    }
}
