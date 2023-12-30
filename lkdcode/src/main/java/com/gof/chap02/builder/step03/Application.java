package com.gof.chap02.builder.step03;

class Application {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder sportsCar = new CarBuilder();
        CarBuilder cityCar = new CarBuilder();
        CarBuilder SUV = new CarBuilder();

        director.constructSportsCar(sportsCar);
        director.constructCityCar(cityCar);
        director.constructSUV(SUV);

        CarManualBuilder sportsCarManual = new CarManualBuilder();
        CarManualBuilder cityCarManual = new CarManualBuilder();
        CarManualBuilder SUVManual = new CarManualBuilder();

        director.constructSUV(sportsCarManual);
        director.constructSUV(cityCarManual);
        director.constructSUV(SUVManual);

        System.out.println("sportsCar = " + sportsCar.getResult().getCarType());
        System.out.println("sportsCarManual = " + sportsCarManual.getResult().print());

        System.out.println("cityCar = " + cityCar.getResult().getCarType());
        System.out.println("cityCarManual = " + cityCarManual.getResult().print());

        System.out.println("SUV = " + SUV.getResult().getCarType());
        System.out.println("SUVManual = " + SUVManual.getResult().print());
    }

}
