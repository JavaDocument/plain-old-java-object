package yewon.class4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yewon.class4.app.common.ParserImpl;

public class ParserTest {

    private ParserImpl parse;

    @BeforeEach
    void init() {
        this.parse = new ParserImpl();
    }

    @Test
    @DisplayName("문자열에 포함된 [, ], \"가 지워져야한다.")
    void removeAllSymbolTest() {
        //given
        String str = "[\"bedi\", \"bedi\", \"donut\", \"bedi\", \"shakevan\"]";
        //when
        String expectedStr = "bedi, bedi, donut, bedi, shakevan";
        String parsedStr = parse.removeAllSymbols(str);
        //then
        Assertions.assertEquals(parsedStr, expectedStr);
    }

    @Test
    @DisplayName("바깥에 있는 []와 \"가 지워져야한다.")
    void removeQuotesTest() {
        //given
        String str = "[[\"bedi\", \"bedi\"], [\"donut\", \"bedi\"], [\"shakevan\"]]";
        //when
        String expectedStr = "[bedi, bedi], [donut, bedi], [shakevan]";
        String parsedStr = parse.removeQuotes(str);
        String subStr = parsedStr.substring(1, parsedStr.length() - 1);
        //then
        Assertions.assertEquals(subStr, expectedStr);
    }
}
