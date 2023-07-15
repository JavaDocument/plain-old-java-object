package lkdcode.class1.app;

import lkdcode.class1.app.domain.calculator.CalculationItems;
import lkdcode.class1.app.domain.calculator.Calculator;
import lkdcode.class1.app.domain.menu.Menu;
import lkdcode.class1.app.domain.util.IntConverterImpl;
import lkdcode.class1.app.domain.validate.ValidImpl;
import lkdcode.class1.app.domain.view.Console;
import lkdcode.class1.app.domain.view.io.ReaderImpl;
import lkdcode.class1.app.domain.view.io.WriterImpl;


public class Application {
    public static void main(String[] args) {
        var reader = new ReaderImpl();
        var writer = new WriterImpl();
        var items = new CalculationItems();
        var valid = new ValidImpl();
        var inputCount = 2;

        Console console = new Console.Builder()
                .reader(reader)
                .writer(writer)
                .items(items)
                .valid(valid)
                .inputCount(inputCount)
                .build();

        var converter = new IntConverterImpl();
        var calculator = new Calculator(converter);

        var menu = new Menu(console, calculator);

        menu.start();
    }

}
