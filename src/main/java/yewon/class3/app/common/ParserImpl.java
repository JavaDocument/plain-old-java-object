package yewon.class3.app.common;

public class ParserImpl implements Parser {

    @Override
    public String string(int i) {
        return String.valueOf(i);
    }

    @Override
    public int integer(char c) {
        return Character.getNumericValue(c);
    }

    public int integer(String str) {
        return Integer.parseInt(str);
    }
}
