package com.gof.chap07.visitor.step1;

import java.util.function.Consumer;
import java.util.function.Predicate;

class ConcreteVisitorA implements Visitor {

    private enum ElementCase {
        CONCRETE_ELEMENT_A_CASE(e -> e == ConcreteElementA.class, e -> ((ConcreteElementA) e).methodElementA()),

        CONCRETE_ELEMENT_B_CASE(e -> e == ConcreteElementB.class, e -> ((ConcreteElementB) e).methodElementB()),
        ;

        private final Predicate<Class<? extends Element>> predicate;
        private final Consumer<Element> consumer;

        ElementCase(Predicate<Class<? extends Element>> predicate, Consumer<Element> consumer) {
            this.predicate = predicate;
            this.consumer = consumer;
        }

        public boolean test(Class<? extends Element> clazz) {
            return this.predicate.test(clazz);
        }

        public void accept(Element target) {
            this.consumer.accept(target);
        }
    }

    @Override
    public void visit(Element element) {
        System.out.println("ConcreteVisitorA.visit.start");
        for (ElementCase elementCase : ElementCase.values()) {
            System.out.println("ConcreteVisitorA do something.......");
            if (elementCase.test(element.getClass())) {
                elementCase.accept(element);
            }
        }
        System.out.println("ConcreteVisitorA.visit.end");
    }
}
