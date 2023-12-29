package com.gof.chap02.builder.step02;

class Application {
    public static void main(String[] args) {

        FruitBox fruitBox = new FruitBox.Builder()
                .appleList(new Apple(), new Apple(), new Apple(), new Apple(), new Apple())
                .bananaList(new Banana())
//                .kiwiList(new Kiwi(), new Kiwi(), new Kiwi())
                .pineAppleList(new PineApple())
                .tomatoList(new Tomato(), new Tomato(), new Tomato(), new Tomato())
                .build();

        System.out.println(fruitBox);
    }
}
