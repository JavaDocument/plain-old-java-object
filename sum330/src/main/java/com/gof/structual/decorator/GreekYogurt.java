package com.gof.structual.decorator;

class GreekYogurt implements Yogurt {

    @Override
    public void decorate() {
        System.out.println("꾸덕꾸덕 그릭요거트");
    }
}
