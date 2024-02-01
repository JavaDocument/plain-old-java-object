package com.gof.chap06.chain_of_responsibilty.generic;


public class Apple {
    private Apple fruit;
    private Class<Apple> appleClass;

    public <T> void e1(T t) {
        if (t instanceof Apple) {
            System.out.println("나는 사과다");
        }
    }

    public <T extends Apple> void e2(Class<T> t) {
        if (t == Apple.class) {
            System.out.println("나는 사과다!!!!!");
        }

        if (t == Banana.class) {
            System.out.println("나는 바나나다!!!!");
        }
    }

    public void e3(Class<? extends Apple> t) {
        if (t == Apple.class) {
            System.out.println("gg");
        }
    }
}
