package com.gof.structual.decorator;

class Blueberry extends YogurtDecorator {

    public Blueberry(Yogurt yogurt) {
        super(yogurt);
    }

    @Override
    public void decorate() {
        super.decorate();
        decorateWithBlueBerry();
    }

    private void decorateWithBlueBerry() {
        System.out.println("블루베리 데코");
    }
}
