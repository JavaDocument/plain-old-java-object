package lkdcode.class1.app.domain.calculator;

import java.util.LinkedList;
import java.util.Queue;

public class CalculationItems {
    private final Queue<String> queue;

    public CalculationItems() {
        this.queue = new LinkedList<>();
    }

    public void add(String value) {
        queue.add(value);
    }

    public String get() {
        return queue.poll();
    }

}
