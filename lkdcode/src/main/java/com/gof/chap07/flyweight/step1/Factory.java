package com.gof.chap07.flyweight.step1;

import java.util.function.Supplier;

enum Factory {
    WORD_A_IMPL(WordAImpl::new),
    WORD_B_IMPL(WordBImpl::new),
    WORD_C_IMPL(WordCImpl::new),
    ;

    private final Supplier<WordClazz> supplier;
    private final WordClazz instance;

    Factory(Supplier<WordClazz> supplier) {
        this.supplier = supplier;
        this.instance = supplier.get();
    }

    public WordClazz getInstance() {
        return this.instance;
    }
}
