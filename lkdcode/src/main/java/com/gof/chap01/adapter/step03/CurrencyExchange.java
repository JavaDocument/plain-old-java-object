package com.gof.chap01.adapter.step03;

class CurrencyExchange {

    public Currency exchange(Currency currency, CurrencyFunction function) {
        return function.execute(currency);
    }

    public Currency exchange(Currency currency, Class<? extends Currency> type) {
        if (currency instanceof USD) {
            if (WON.class.isAssignableFrom(type)) {
                return new WON(currency.getAmount() * 1_000.0);
            }
            if (YEN.class.isAssignableFrom(type)) {
                return new YEN(currency.getAmount() * 140.0);
            }
        }

        if (currency instanceof WON) {
            if (USD.class.isAssignableFrom(type)) {
                return new USD(currency.getAmount() / 1_000.0);
            }
            if (YEN.class.isAssignableFrom(type)) {
                return new YEN(currency.getAmount() / 800.0);
            }
        }

        if (currency instanceof YEN) {
            if (WON.class.isAssignableFrom(type)) {
                return new WON(currency.getAmount() * 800.0);
            }
            if (USD.class.isAssignableFrom(type)) {
                return new USD(currency.getAmount() / 140.0);
            }
        }

        return currency;
    }

}
