package com.gof.chap01.singleton;

/**
 * single-ton
 */
class Banana {
    private static Banana intstance;

    private Banana() {
    }

    public static Banana getIntstance() {
        if (intstance == null) {
            System.out.println("멀티 쓰레드 환경에서 1번이상 출력될 수 있다.");
            intstance = new Banana();
        }

        return intstance;
    }
}
