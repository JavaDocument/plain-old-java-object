package com.gof.chap06.chain_of_responsibilty.step1;

class HomePromotion extends PromotionMiddleware {

    @Override
    double discount(double amount) {
        System.out.println("HomePromotion.discount: 15%, [" + amount + "]");
        return nextDiscount(amount * 0.85);
    }
}
