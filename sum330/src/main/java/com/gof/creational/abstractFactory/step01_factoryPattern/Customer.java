package com.gof.creational.abstractFactory.step01_factoryPattern;

class Customer {

    public static void main(String[] args) {

        Perfume rosePerfume = new RosePerfumeFactory().orderPerfume("꽃꽃꽃");
        System.out.println(rosePerfume);
        System.out.println();

        Perfume soapPerfume = new SoapPerfumeFactory().orderPerfume("애기애기향");
        System.out.println(soapPerfume);
    }
}
