package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfumeFactory;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume.Perfume;

public interface PerfumeFactory {

    default Perfume orderPerfume(String customName) {
        Perfume perfume = makePerfume();
        order(perfume.getName());
        customazing(customName);
        delivery(customName);
        return perfume;
    }

    Perfume makePerfume();

    void order(String name);

    void customazing(String customName);

    void delivery(String customName);


}
