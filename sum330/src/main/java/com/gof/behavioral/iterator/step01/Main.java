package com.gof.behavioral.iterator.step01;

public class Main {

    public static void main(String[] args) {

        RaccoonList raccoonList = new RaccoonList();
        raccoonList.addRaccoon(new Raccoon("라쿤1", 1));
        raccoonList.addRaccoon(new Raccoon("라쿤2", 2));
        raccoonList.addRaccoon(new Raccoon("라쿤3", 2));

        while (raccoonList.hasNext()) {
            System.out.println(raccoonList.getNext());
        }

        RaccoonArrays raccoonArrays = new RaccoonArrays();
        raccoonArrays.addRaccoon(new Raccoon("라쿤1", 1));
        raccoonArrays.addRaccoon(new Raccoon("라쿤2", 2));
        raccoonArrays.addRaccoon(new Raccoon("라쿤3", 3));

        while (raccoonArrays.hasNext()) {
            System.out.println(raccoonArrays.getNext());
        }
    }
}
