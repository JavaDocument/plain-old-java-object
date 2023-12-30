package com.gof.chap02.builder.step04;

class Application {

    public static void main(String[] args) {
        FruitDirector fruitDirector = new FruitDirector();

        FruitBuilderImpl bananaBuilder = new FruitBuilderImpl();
        FruitBuilderImpl tomatoBuilder = new FruitBuilderImpl();


        fruitDirector.constructBanana(bananaBuilder);
        fruitDirector.constructTomato(tomatoBuilder);

        Fruit banana = bananaBuilder.create();
        Fruit tomato = tomatoBuilder.create();

        System.out.println("banana = " + banana);
        System.out.println("tomato = " + tomato);
    }

}
