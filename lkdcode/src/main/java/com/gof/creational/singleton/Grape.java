package com.gof.creational.singleton;

/**
 * synchronized
 */
class Grape {
    private static Grape INSTANCE;

    private Grape() {
    }

    public synchronized static Grape getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Grape();
        }

        return INSTANCE;
    }
}
