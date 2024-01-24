package com.gof.structual.decorator;

class YogurtDecorator implements Yogurt {

    private Yogurt yogurt;

    public YogurtDecorator(Yogurt yogurt) {
        this.yogurt = yogurt;
    }

    @Override
    public void decorate() {
        yogurt.decorate();
    }
}
