package jefeel.class3.app;


import java.util.ArrayList;
import java.util.List;


public class Main {

    public static int addEachNumber(int number) {
        int sum = 0;
        String convertNum = String.valueOf(number);

        char[] digit = convertNum.toCharArray();
        for (int i = 0; i < digit.length; i++) {
            sum += digit[i] - '0';
            System.out.println("구한 합: " + sum);
        }

        return sum;
    }


    public static int multiplyEachNumber(int number) {
        int result = 1;
        String convertNum = String.valueOf(number);

        char[] digit = convertNum.toCharArray();
        for (int i = 0; i < digit.length; i++) {
            result = result*(digit[i] - '0');
            System.out.println("구한 곱: " + result);
        }

        return result;

    }

    public static int compareNumber(int leftPage, int rightPage) {
        return Math.max(leftPage, rightPage);
    }


    public static void main(String[] args) {

        List<Integer> pobi = new ArrayList<>();
        List<Integer> crong = new ArrayList<>();


        // 램던 숫자가 두 개 뽑고 각각 리스트에 추가
        int randomPage1 = ((int) (Math.random() * 400 + 1)) / 2;
        int randomPage2 = ((int) (Math.random() * 400 + 1)) / 2;

        System.out.println("pobi가 얻은 숫자: " + randomPage1);

        pobi.add(randomPage1);
        pobi.add(randomPage1 + 1);

        crong.add(randomPage2);
        crong.add(randomPage2 + 1);

        // 각 자리의 숫자를 모두 더하거나 곱해준다
        System.out.println("pobi가 얻은 숫자의 각 자리 합: " + addEachNumber(pobi.get(0)));
        System.out.println("pobi가 얻은 숫자의 각 자리 곱: " + multiplyEachNumber(pobi.get(0)));


    }
}
