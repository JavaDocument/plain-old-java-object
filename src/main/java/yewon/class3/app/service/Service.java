package yewon.class3.app.service;

import yewon.class3.app.handler.OutputHandlerImpl;

import java.util.*;

import static yewon.class3.app.Result.*;

public class Service {

    // 계산
    public int getLargest(String[] crew) {
        List<Integer> calcResultList = getCalcResultList(crew);
//        int maxNumber = calcResultList.get(0);
//        for (int i = 1; i < calcResultList.size(); i++) {
//            int currentNumber = calcResultList.get(i);
//            if (calcResultList.get(i) > maxNumber) {
//                maxNumber = currentNumber;
//            }
//        }
        int maxNumber = Collections.max(calcResultList);
        return maxNumber;
    }

    private List<Integer> getCalcResultList(String[] crew) {
        List<Integer> calcResultList = new ArrayList<>();
        for (String page : crew) {
            calcResultList.add(getSumDigits(page));
            calcResultList.add(getMultiplyDigits(page));
        }
        return calcResultList;
    }

    private int getSumDigits(String page) {
        int result = 0;
        for (int i = 0; i < page.length(); i++) {
            result += parseInt(page.charAt(i));
        }
        return result;
    }

    private int getMultiplyDigits(String page) {
        int result = 1;
        for (int i = 0; i < page.length(); i++) {
            result *= parseInt(page.charAt(i));
        }
        return result;
    }

    // 페이지
    public String[] selectPages() {
        int randomInt =  (int) (Math.random() * 400) + 1;
        return makePages(randomInt);
    }

    private String[] makePages(int randomInt) {
        if (isEvenNumber(randomInt)) {
            return new String[]{
                    parseString(randomInt - 1)
                    , parseString(randomInt)
            };
        }
        return new String[]{
                parseString(randomInt)
                , parseString(randomInt + 1)
        };
    }

    // 짝수이면 true, 홀수이면 false
    private boolean isEvenNumber(int randomInt) {
        return randomInt % 2 == 0;
    }

    private String parseString(int i) {
        return String.valueOf(i);
    }

    private int parseInt(char c) {
        return Character.getNumericValue(c);
    }

}
