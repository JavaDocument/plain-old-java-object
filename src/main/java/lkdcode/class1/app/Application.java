package lkdcode.class1.app;

import lkdcode.class1.app.domain.calculator.CalculationItems;
import lkdcode.class1.app.domain.calculator.Calculator;
import lkdcode.class1.app.domain.menu.Menu;
import lkdcode.class1.app.domain.util.Converter;
import lkdcode.class1.app.domain.util.IntConverterImpl;
import lkdcode.class1.app.domain.validate.Valid;
import lkdcode.class1.app.domain.validate.ValidImpl;
import lkdcode.class1.app.domain.view.Console;
import lkdcode.class1.app.domain.view.io.ReaderImpl;
import lkdcode.class1.app.domain.view.io.WriterImpl;
import lkdcode.class1.app.domain.view.io.Reader;
import lkdcode.class1.app.domain.view.io.Writer;

public class Application {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();
        CalculationItems calculationItems = new CalculationItems();

        Valid valid = new ValidImpl();

        Console console = new Console(reader, writer, calculationItems, valid);

        Converter converter = new IntConverterImpl();

        Calculator calculator = new Calculator(converter);

        Menu menu = new Menu(console, calculator);

        menu.start();
    }
}
