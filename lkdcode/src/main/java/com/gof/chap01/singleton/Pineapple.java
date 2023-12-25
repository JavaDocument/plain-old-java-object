package com.gof.chap01.singleton;

/**
 * 이중 체크 락(Double-Checked Locking)
 */
class Pineapple {
    private static volatile Pineapple instance;

    private Pineapple() {
    }

    public static Pineapple getInstance() {
        if (instance == null) {
            synchronized (Pineapple.class) {
                if (instance == null) {
                    instance = new Pineapple();
                }
            }
        }
        return instance;
    }
}
