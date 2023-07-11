package lkdcode.class1.app;

import lkdcode.class1.app.domain.calculator.CalculationItems;
import lkdcode.class1.app.domain.calculator.Calculator;
import lkdcode.class1.app.domain.menu.Menu;
import lkdcode.class1.app.domain.operator.Operator;
import lkdcode.class1.app.domain.operator.Plus;
import lkdcode.class1.app.domain.util.Converter;
import lkdcode.class1.app.domain.util.IntConverterImpl;
import lkdcode.class1.app.domain.view.Console;
import lkdcode.class1.app.domain.view.io.ConsoleReader;
import lkdcode.class1.app.domain.view.io.ConsoleWriter;
import lkdcode.class1.app.domain.view.io.Reader;
import lkdcode.class1.app.domain.view.io.Writer;

public class Application {
    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        CalculationItems calculationItems = new CalculationItems();

        Console console = new Console(reader, writer, calculationItems);

        Operator operator = Plus.getInstance();
        Converter converter = new IntConverterImpl();

        Calculator calculator = new Calculator(operator, converter);

        Menu menu = new Menu(console, calculator);

        menu.start();
    }
}
