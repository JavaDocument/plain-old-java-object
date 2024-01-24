package com.gof.chap04.factory_method.step1;

abstract class Factory {

    public final Product create(final String owner) {
        final Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

}
