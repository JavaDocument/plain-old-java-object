package yewon.class4.app.common;

public class ParserImpl implements Parser {

    @Override
    public String removeAllSymbols(String str) {
        return str.replaceAll("[\\[\\]\"]", "");
    }

    @Override
    public String removeQuotes(String str) {
        return str.replaceAll("\"", "");
    }

    @Override
    public String removeBracket(String str) {
        return str.replaceAll("[\\[\\]]", "");
    }

}
