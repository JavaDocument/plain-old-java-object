package com.gof.behavioral.iterator.step02;

public class Main {

    public static void main(String[] args) {

        // 다음값이 있으면 hasNext()
        // getNext();


        RaccoonList raccoonList = new RaccoonList();
        raccoonList.addRaccoon(new Raccoon("라쿤2", 1));
        raccoonList.addRaccoon(new Raccoon("라쿤2", 2));

        while (raccoonList.hasNext()) {
            System.out.println(raccoonList.getNext());
        }

//        if (new ArrayList<>().get(0) == null) {
//            System.out.println("?");
//        }
    }
}
