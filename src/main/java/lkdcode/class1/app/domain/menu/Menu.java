package lkdcode.class1.app.domain.menu;

import lkdcode.class1.app.domain.calculator.CalculationItems;
import lkdcode.class1.app.domain.calculator.Calculator;
import lkdcode.class1.app.domain.view.Console;


public class Menu {
    private final Console console;
    private final Calculator calculator;

    public Menu(Console console, Calculator calculator) {
        this.console = console;
        this.calculator = calculator;
    }

    public void start() {
        CalculationItems items = console.input();
        double result = calculator.calculate(items);
        console.output(result);
    }

}
