package com.gof.chap02.builder.step02;

import java.util.Arrays;
import java.util.List;

class FruitBox {

    private final List<Apple> appleList;
    private final List<Banana> bananaList;
    private final List<Kiwi> kiwiList;
    private final List<PineApple> pineAppleList;
    private final List<Tomato> tomatoList;

    private FruitBox(List<Apple> appleList, List<Banana> bananaList, List<Kiwi> kiwiList, List<PineApple> pineAppleList, List<Tomato> tomatoList) {
        this.appleList = appleList;
        this.bananaList = bananaList;
        this.kiwiList = kiwiList;
        this.pineAppleList = pineAppleList;
        this.tomatoList = tomatoList;
    }

    static class Builder {

        private List<Apple> appleList;
        private List<Banana> bananaList;
        private List<Kiwi> kiwiList;
        private List<PineApple> pineAppleList;
        private List<Tomato> tomatoList;

        Builder appleList(Apple... appleList) {
            this.appleList = Arrays.asList(appleList);
            return this;
        }

        Builder bananaList(Banana... bananaList) {
            this.bananaList = Arrays.asList(bananaList);
            return this;
        }

        Builder kiwiList(Kiwi... kiwiList) {
            this.kiwiList = Arrays.asList(kiwiList);
            return this;
        }

        Builder pineAppleList(PineApple... pineAppleList) {
            this.pineAppleList = Arrays.asList(pineAppleList);
            return this;
        }

        Builder tomatoList(Tomato... tomatoList) {
            this.tomatoList = Arrays.asList(tomatoList);
            return this;
        }

        FruitBox build() {
            return new FruitBox(this.appleList, this.bananaList, this.kiwiList, this.pineAppleList, this.tomatoList);
        }
    }

    @Override
    public String toString() {
        return "FruitBox{" +
                "appleList=" + appleList +
                ", bananaList=" + bananaList +
                ", kiwiList=" + kiwiList +
                ", pineAppleList=" + pineAppleList +
                ", tomatoList=" + tomatoList +
                '}';
    }

}
