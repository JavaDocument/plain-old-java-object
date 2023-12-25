package com.gof.chap01.adapter.step03;

class Application {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        WON myCurrency = new WON(3_000);

        USD exchange = (USD) currencyExchange.exchange(myCurrency,
                currency -> new USD(currency.getAmount() / 1_000));

        System.out.println(exchange.getAmount());
    }
}
