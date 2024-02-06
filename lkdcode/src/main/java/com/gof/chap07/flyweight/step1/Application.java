package com.gof.chap07.flyweight.step1;

import java.util.ArrayList;
import java.util.List;

class Application {

    public static void main(String[] args) {
        final List<WordClazz> list = new ArrayList<>();

        final String[] array = new String[]{
                "A", "A", "A", "A", "A", "A",
                "B", "B", "B", "B", "B", "B", "B",
                "C", "C", "C", "C", "C", "C", "C",
        };

        for (String target : array) {
            switch (target) {
                case "A" -> list.add(Factory.WORD_A_IMPL.getInstance());
                case "B" -> list.add(Factory.WORD_B_IMPL.getInstance());
                case "C" -> list.add(Factory.WORD_C_IMPL.getInstance());
                default -> System.out.println("Null");
            }
        }

        list.forEach(e -> System.out.println(e.getCode() + " instance: " + e.hashCode()));
    }
}
