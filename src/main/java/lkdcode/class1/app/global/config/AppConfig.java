package lkdcode.class1.app.global.config;

import lkdcode.class1.app.domain.calculator.CalculationItems;
import lkdcode.class1.app.domain.calculator.Calculator;
import lkdcode.class1.app.domain.util.Converter;
import lkdcode.class1.app.domain.util.DoubleConverterImpl;
import lkdcode.class1.app.domain.validate.Valid;
import lkdcode.class1.app.domain.validate.ValidImpl;
import lkdcode.class1.app.domain.view.Console;
import lkdcode.class1.app.domain.view.io.Reader;
import lkdcode.class1.app.domain.view.io.ReaderImpl;
import lkdcode.class1.app.domain.view.io.Writer;
import lkdcode.class1.app.domain.view.io.WriterImpl;

public class AppConfig {

    private static final int INPUT_COUNT = 3;

    public static Calculator calculator() {
        return new Calculator(doubleConverterImpl());
    }

    public static Console console() {
        return new Console.Builder()
                .reader(readerImpl())
                .writer(writerImpl())
                .items(items())
                .valid(validImpl())
                .inputCount(INPUT_COUNT)
                .build();
    }

    private static Reader readerImpl() {
        return new ReaderImpl();
    }

    private static Writer writerImpl() {
        return new WriterImpl();
    }

    private static CalculationItems items() {
        return new CalculationItems();
    }

    private static Valid validImpl() {
        return new ValidImpl();
    }

    private static Converter doubleConverterImpl() {
        return new DoubleConverterImpl();
    }
}
