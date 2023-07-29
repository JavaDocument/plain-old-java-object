package yewon.class4.app.common;

public interface Parser {

    // '[', ']', '"' 제거
    String removeAllSymbols(String str);

    // " 제거
    String removeQuotes(String str);

    // [] 제거
    String removeBracket(String str);

}
