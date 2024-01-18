package com.gof.creational.factoryMethod.step01;

class KimchiFactory implements KimchizzimFactory {

    @Override
    public Kimchizzim createKimchizzim() {
        return new Kimchi();
    }
}
