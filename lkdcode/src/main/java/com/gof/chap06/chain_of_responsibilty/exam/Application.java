package com.gof.chap06.chain_of_responsibilty.exam;

class Application {
    public static void main(String[] args) {

        ValidPasswordMiddleware valid = ValidPasswordMiddleware.chainOf(
                new Mango(),//100
                new Guava()//200
//                new Mango(),//300
//                new Guava(),//400
//                new Mango(),//500
//                new Guava(),//600
//                new Mango(),//700
//                new Guava(),//800
//                new Mango(),//900
//                new Guava(),//1000
//                new Mango(),//1100
//                new Guava()//1200
        );

        boolean result = valid.valid("app");
        System.out.println(result);
    }
}
