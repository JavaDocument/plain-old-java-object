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
    private int inputCount;

    private int startIdx = 1;

    private Console(Reader reader, Writer writer, Valid valid, CalculationItems items, int inputCount) {
        this.reader = reader;
        this.writer = writer;
        this.valid = valid;
        this.items = items;
        this.inputCount = inputCount + 1;
    }

    public CalculationItems makeCalculationItems() {
        while (startIdx != inputCount) {
            output(startIdx + "번째 숫자를 입력해주세요.");
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
            startIdx++;
            return;
        }

        output("정수를 입력해주세요.");
    }


    public static class Builder {
        private Reader reader;
        private Writer writer;
        private Valid valid;
        private CalculationItems items;
        private int inputCount;

        public Builder reader(Reader reader) {
            this.reader = reader;
            return this;
        }

        public Builder writer(Writer writer) {
            this.writer = writer;
            return this;
        }

        public Builder valid(Valid valid) {
            this.valid = valid;
            return this;
        }

        public Builder items(CalculationItems items) {
            this.items = items;
            return this;
        }

        public Builder inputCount(int inputCount) {
            this.inputCount = inputCount;
            return this;
        }

        public Console build() {
            return new Console(reader, writer, valid, items, inputCount);
        }

    }


}
