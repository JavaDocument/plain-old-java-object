package com.gof.chap06.chain_of_responsibilty.step1;

abstract class PromotionMiddleware {
    private PromotionMiddleware next;

    public static PromotionMiddleware link(PromotionMiddleware first, PromotionMiddleware... chain) {
        PromotionMiddleware head = first;

        for (PromotionMiddleware link : chain) {
            head.next = link;
            head = link;
        }

        return first;
    }

    abstract double discount(double amount);

    public double nextDiscount(double number) {
        if (next == null) return number;

        return next.discount(number);
    }
}
