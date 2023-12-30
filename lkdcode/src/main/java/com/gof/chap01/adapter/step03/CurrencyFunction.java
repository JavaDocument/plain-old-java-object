package com.gof.chap01.adapter.step03;


@FunctionalInterface
interface CurrencyFunction {
    Currency execute(Currency currency);
}
