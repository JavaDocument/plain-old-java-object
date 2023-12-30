package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfumeFactory;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume.Color;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume.Perfume;

public class SoapPerfume extends Perfume {

    public SoapPerfume() {
        setName("비누향 향수");
        setColor(Color.WHITE);
    }


}
