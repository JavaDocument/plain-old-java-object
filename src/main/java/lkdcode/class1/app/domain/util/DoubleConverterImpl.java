package lkdcode.class1.app.domain.util;

public class DoubleConverterImpl implements Converter {

    @Override
    public double to(String value) {
        return Double.parseDouble(value);
    }

}
