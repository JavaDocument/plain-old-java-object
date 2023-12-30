package com.gof.creational.abstractFactory.step01_factoryPattern;


class Customer {

    public static void main(String[] args) {

        Perfume rosePerfume = new RosePerfumeFactory().orderPerfume("꽃꽃꽃");
        System.out.println(rosePerfume);
        System.out.println();

        Perfume soapPerfume = new SoapPerfumeFactory().orderPerfume("애기애기향");
        System.out.println(soapPerfume);
        System.out.println();

        Customer customer = new Customer();
        customer.order(new RosePerfumeFactory(), "플라워어어어엉");
        customer.order(new SoapPerfumeFactory(), "비뉴비늉");
    }

    private void order(PerfumeFactory perfumeFactory, String customName) {
        System.out.println(perfumeFactory.orderPerfume(customName));
    }
}
