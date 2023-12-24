package jhlee.class5.problem3.app.service;

import jhlee.class5.problem3.app.dto.request.RequestDTO;
import jhlee.class5.problem3.app.dto.response.ResponseDTO;

public class Service {
    private static final char A = 'A';
    private static final char Z = 'Z';
    private static final char a = 'a';
    private static final char z = 'z';
    private Service() {}
    public static Service newInstance() {
        return new Service();
    }
    public ResponseDTO changeWord(RequestDTO dto) {
        String word = dto.word();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(changeChar(word.charAt(i)));
        }
        return new ResponseDTO(sb.toString());
    }
    private char changeChar(char c) {
        if (c < A || c > z || (c > Z && c < a)) return c;

        double amount;
        double pivot = c <= Z ? (A + Z) / 2.0 : (a + z) / 2.0;

        amount = c - pivot;
        return (char) Math.abs(pivot - amount);
    }
}
