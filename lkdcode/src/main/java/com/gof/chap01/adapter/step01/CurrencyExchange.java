package com.gof.chap01.adapter.step01;

class CurrencyExchange {
    private final double WON_DOLLAR_EXCHANGE_RATE = 1_000.0;

    public Won dollarToWon(Dollar dollar) {
        return new Won((int) (dollar.getAmount() * WON_DOLLAR_EXCHANGE_RATE));
    }

    public Dollar wonToDollar(Won won) {
        return new Dollar((int) (won.getAmount() * WON_DOLLAR_EXCHANGE_RATE));
    }
}
