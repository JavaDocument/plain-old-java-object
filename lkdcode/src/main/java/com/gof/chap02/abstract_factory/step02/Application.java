package com.gof.chap02.abstract_factory.step02;


import com.gof.chap02.abstract_factory.step02.dessert.Dessert;
import com.gof.chap02.abstract_factory.step02.fruit.Fruit;
import com.gof.chap02.abstract_factory.step02.main_dish.MainDish;
import com.gof.chap02.abstract_factory.step02.side_dish.SideDish;

class Application {
    public static void main(String[] args) {

        BestMenuFactory bestMenuFactory = new BestMenuFactory();
        Dessert dessert = bestMenuFactory.createDessert();
        SideDish sideDish = bestMenuFactory.createSideDish();
        MainDish mainDish = bestMenuFactory.createMainDish();
        Fruit fruit = bestMenuFactory.createFruit();

        System.out.println("====== BestMenu ======");
        System.out.println("dessert = " + dessert);
        System.out.println("sideDish = " + sideDish);
        System.out.println("mainDish = " + mainDish);
        System.out.println("fruit = " + fruit);
        System.out.println("====== BestMenu ======\n");


        CoupleMenuFactory coupleMenuFactory = new CoupleMenuFactory();
        Dessert dessert1 = coupleMenuFactory.createDessert();
        SideDish sideDish1 = coupleMenuFactory.createSideDish();
        MainDish mainDish1 = coupleMenuFactory.createMainDish();
        Fruit fruit1 = coupleMenuFactory.createFruit();

        System.out.println("====== CoupleMenu ======");
        System.out.println("dessert1 = " + dessert1);
        System.out.println("sideDish1 = " + sideDish1);
        System.out.println("mainDish1 = " + mainDish1);
        System.out.println("fruit1 = " + fruit1);
        System.out.println("====== CoupleMenu ======\n");

        FamilyMenuFactory familyMenuFactory = new FamilyMenuFactory();

        Dessert dessert2 = familyMenuFactory.createDessert();
        SideDish sideDish2 = familyMenuFactory.createSideDish();
        MainDish mainDish2 = familyMenuFactory.createMainDish();
        Fruit fruit2 = familyMenuFactory.createFruit();

        System.out.println("====== FamilyMenu ======");
        System.out.println("dessert2 = " + dessert2);
        System.out.println("sideDish2 = " + sideDish2);
        System.out.println("mainDish2 = " + mainDish2);
        System.out.println("fruit2 = " + fruit2);
        System.out.println("====== FamilyMenu ======");
    }
}
