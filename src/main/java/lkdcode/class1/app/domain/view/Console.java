package lkdcode.class1.app.domain.view;

import lkdcode.class1.app.domain.calculator.CalculationItems;
import lkdcode.class1.app.domain.validate.Valid;
import lkdcode.class1.app.domain.view.io.Reader;
import lkdcode.class1.app.domain.view.io.Writer;

public class Console {
    private final Reader reader;
    private final Writer writer;
    private final Valid valid;
    private final CalculationItems items;
    private final String PLUS = "+";
    private final int STOP = 3;
    private int inputCount;

    public Console(Reader reader, Writer writer, CalculationItems items, Valid valid) {
        this.reader = reader;
        this.writer = writer;
        this.items = items;
        this.valid = valid;
        this.inputCount = 1;
    }

    public CalculationItems makeCalculationItems() {
        while (inputCount != STOP) {
            output(inputCount + "번째 숫자를 입력해주세요.");
            addInputNumber();
            items.add(PLUS);
        }

        return items;
    }

    public <T> void output(T value) {
        writer.write(value);
    }

    private void addInputNumber() {
        String inputValue = reader.read();

        if (valid.validNumber(inputValue)) {
            items.add(inputValue);
            inputCount++;
            return;
        }

        output("정수를 입력해주세요.");
    }


}
