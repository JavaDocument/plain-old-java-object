package com.gof.creational.factoryMethod.step01;

class PorkFactory implements KimchizzimFactory{

    @Override
    public Kimchizzim createKimchizzim() {
        return new Pork();
    }
}
