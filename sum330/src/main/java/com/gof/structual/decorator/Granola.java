package com.gof.structual.decorator;

class Granola extends YogurtDecorator {

    public Granola(Yogurt yogurt) {
        super(yogurt);
    }

    @Override
    public void decorate() {
        super.decorate();
        decorateWithGranola();
    }

    private void decorateWithGranola() {
        System.out.println("그래놀라 데코");
    }
}
