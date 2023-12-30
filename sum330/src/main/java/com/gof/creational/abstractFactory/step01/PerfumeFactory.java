package com.gof.creational.abstractFactory.step01;

interface PerfumeFactory {

    default Perfume orderPerfume(String customazingName) {
        Perfume perfume = makePerfume();
        order(perfume.getName());
        customazing(customazingName);
        delivery(customazingName);
        return perfume;
    }

    Perfume makePerfume();

    void order(String name);

    void customazing(String customazingName);

    void delivery(String customazingName);


}
