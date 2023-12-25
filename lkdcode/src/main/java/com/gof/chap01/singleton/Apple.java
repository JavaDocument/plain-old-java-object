package com.gof.chap01.singleton;

/**
 * 정적 초기화
 */
class Apple {

    private static final Apple INSTANCE = new Apple();

    private Apple() {
    }

    public static Apple getInstance() {
        return INSTANCE;
    }

}
