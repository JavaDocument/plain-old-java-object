package com.gof.chap06.chain_of_responsibilty.step1;

public class PromotionServer {
    private final PromotionMiddleware promotionMiddleware;

    public PromotionServer(PromotionMiddleware promotionMiddleware) {
        this.promotionMiddleware = promotionMiddleware;
    }

    public double discount(double amount) {
        return promotionMiddleware.discount(amount);
    }
}
