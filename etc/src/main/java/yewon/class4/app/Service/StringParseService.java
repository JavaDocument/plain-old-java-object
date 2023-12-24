package yewon.class4.app.Service;

import yewon.class4.app.common.ParserImpl;

public class StringParseService {

    private final ParserImpl parser;

    public StringParseService() {
        parser = new ParserImpl();
    }

    public String[][] friendsParsing(String inputFriends) {
        // 바깥 [[, ]], " 제거 후 '], [' 를 기준으로 나눈다.
        String element = inputFriends.substring(2, inputFriends.length() - 2);
        String[] rowFriends = parser.removeQuotes(element).split("\\], \\[");
        String[][] friends = new String[rowFriends.length][2];
        for (int i = 0; i < rowFriends.length; i++) {
            friends[i] = rowFriends[i].split(", ");
        }
        return friends;
    }

    public String[] visitorsParsing(String inputVisitors) {
        return parser.removeAllSymbols(inputVisitors).split(", ");
    }
}
