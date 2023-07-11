package lkdcode.class1.app.domain.view;

import lkdcode.class1.app.domain.calculator.CalculationItems;
import lkdcode.class1.app.domain.view.io.Reader;
import lkdcode.class1.app.domain.view.io.Writer;

public class Console {
    private final Reader reader;
    private final Writer writer;
    private final CalculationItems items;

    public Console(Reader reader, Writer writer, CalculationItems items) {
        this.reader = reader;
        this.writer = writer;
        this.items = items;
    }

    public CalculationItems input() {
        writer.write("첫번째 숫자를 입력해주세요.");
        String firstNumber = reader.read();
        items.add(firstNumber);
        
        writer.write("두번째 숫자를 입력해주세요.");
        String secondNumber = reader.read();
        items.add(secondNumber);

        return items;
    }

    public <T> void output(T message) {
        writer.write(message);
    }

}
