package golddrone.class5.problem3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final Map<Character, Character> treeFrogDictionary;

    static {
        treeFrogDictionary = new HashMap<>();
        treeFrogDictionary.put('A', 'Z');
        treeFrogDictionary.put('B', 'Y');
        treeFrogDictionary.put('C', 'X');
        treeFrogDictionary.put('D', 'W');
        treeFrogDictionary.put('E', 'V');
        treeFrogDictionary.put('F', 'U');
        treeFrogDictionary.put('G', 'T');
        treeFrogDictionary.put('H', 'S');
        treeFrogDictionary.put('I', 'R');
        treeFrogDictionary.put('J', 'Q');
        treeFrogDictionary.put('K', 'P');
        treeFrogDictionary.put('L', 'O');
        treeFrogDictionary.put('M', 'N');
        treeFrogDictionary.put('N', 'M');
        treeFrogDictionary.put('O', 'L');
        treeFrogDictionary.put('P', 'K');
        treeFrogDictionary.put('Q', 'J');
        treeFrogDictionary.put('R', 'I');
        treeFrogDictionary.put('S', 'H');
        treeFrogDictionary.put('T', 'G');
        treeFrogDictionary.put('U', 'F');
        treeFrogDictionary.put('V', 'E');
        treeFrogDictionary.put('W', 'D');
        treeFrogDictionary.put('X', 'C');
        treeFrogDictionary.put('Y', 'B');
        treeFrogDictionary.put('Z', 'A');

        treeFrogDictionary.put('a', 'z');
        treeFrogDictionary.put('b', 'y');
        treeFrogDictionary.put('c', 'x');
        treeFrogDictionary.put('d', 'w');
        treeFrogDictionary.put('e', 'v');
        treeFrogDictionary.put('f', 'u');
        treeFrogDictionary.put('g', 't');
        treeFrogDictionary.put('h', 's');
        treeFrogDictionary.put('i', 'r');
        treeFrogDictionary.put('j', 'q');
        treeFrogDictionary.put('k', 'p');
        treeFrogDictionary.put('l', 'o');
        treeFrogDictionary.put('m', 'n');
        treeFrogDictionary.put('n', 'm');
        treeFrogDictionary.put('o', 'l');
        treeFrogDictionary.put('p', 'k');
        treeFrogDictionary.put('q', 'j');
        treeFrogDictionary.put('r', 'i');
        treeFrogDictionary.put('s', 'h');
        treeFrogDictionary.put('t', 'g');
        treeFrogDictionary.put('u', 'f');
        treeFrogDictionary.put('v', 'e');
        treeFrogDictionary.put('w', 'd');
        treeFrogDictionary.put('x', 'c');
        treeFrogDictionary.put('y', 'b');
        treeFrogDictionary.put('z', 'a');
    }


    public static StringBuilder solution(final String word) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            if (c == ' ') {
                result.append(' ');
                continue;
            }

            result.append(treeFrogDictionary.get(c));
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(solution("I love you"));
    }
}
