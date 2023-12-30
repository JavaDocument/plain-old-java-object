package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfumeFactory;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume.Perfume;

public class SoapPerfumeFactory extends DefaultPerfumeFactory {

    @Override
    public Perfume makePerfume() {
        return new SoapPerfume();
    }
}
