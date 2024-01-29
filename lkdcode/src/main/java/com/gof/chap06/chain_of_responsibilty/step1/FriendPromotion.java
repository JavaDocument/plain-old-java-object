package com.gof.chap06.chain_of_responsibilty.step1;

class FriendPromotion extends PromotionMiddleware {
    @Override
    double discount(double amount) {
        System.out.println("FriendPromotion.discount: -1_000, [" + amount + "]");
        return nextDiscount(amount - 1_000);
    }
}
