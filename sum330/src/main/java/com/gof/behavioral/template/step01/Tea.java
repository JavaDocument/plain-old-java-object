package com.gof.behavioral.template.step01;

class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void steepTeaBag() {
        System.out.println("찻잎 우려내는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    public void addLemon() {
        System.out.println("레몬 추가");
    }
}
