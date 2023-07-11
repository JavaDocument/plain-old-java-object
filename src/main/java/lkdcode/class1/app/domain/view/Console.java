package lkdcode.class1.app.domain.view;

import lkdcode.class1.app.domain.calculator.CalculationItems;
import lkdcode.class1.app.domain.view.io.Reader;
import lkdcode.class1.app.domain.view.io.Writer;

public class Console {
    private final Reader reader;
    private final Writer writer;
    private final CalculationItems items;
    private final String PLUS = "+";

    public Console(Reader reader, Writer writer, CalculationItems items) {
        this.reader = reader;
        this.writer = writer;
        this.items = items;
    }

    public CalculationItems makeCalculationItems() {
        addInputNumber("첫번째 숫자를 입력해주세요.");
        items.add(PLUS);
        addInputNumber("두번째 숫자를 입력해주세요.");

        return items;
    }

    public <T> void output(T message) {
        writer.write(message);
    }

    private void addInputNumber(String message) {
        writer.write(message);
        String read = reader.read();
        items.add(read);
    }

}
