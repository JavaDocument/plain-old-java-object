package com.gof.chap04.factory_method.step1;

class 메이플공장 extends Factory {
    @Override
    protected Product createProduct(final String owner) {
        if (owner.equals("전사")) return new 전사();
        if (owner.equals("법사")) return new 법사();

        return null;
    }

    @Override
    protected void registerProduct(final Product product) {
        System.out.println("등록: " + product.getClass().getSimpleName());
    }
}
