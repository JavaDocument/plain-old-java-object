package com.gof.chap06.chain_of_responsibilty.step1;

class WeekPromotion extends PromotionMiddleware {
    @Override
    double discount(double amount) {
        System.out.println("WeekPromotion.discount: 10%, [" + amount + "]");
        return nextDiscount(amount * 0.9);
    }
}
