package com.gof.chap06.chain_of_responsibilty.step1;

class Application {
    public static void main(String[] args) {
        final PromotionMiddleware promotion = PromotionMiddleware.link(
                new WeekPromotion(),
                new HomePromotion(),
                new FriendPromotion()
        );

        double amount1 = 50_000;
        double amount2 = 30_000;
        double amount3 = 15_000;
        double amount4 = 8_000;

        final double discount1 = promotion.discount(amount1);
        System.out.println("discount1 = " + discount1);

        final double discount2 = promotion.discount(amount2);
        System.out.println("discount2 = " + discount2);

        final double discount3 = promotion.discount(amount3);
        System.out.println("discount3 = " + discount3);

        final double discount4 = promotion.discount(amount4);
        System.out.println("discount4 = " + discount4);
    }
}
