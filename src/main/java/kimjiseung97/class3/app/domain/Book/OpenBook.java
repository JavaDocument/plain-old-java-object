package kimjiseung97.class3.app.domain.Book;

import kimjiseung97.class3.app.domain.member.Member;

import java.util.*;

public class OpenBook implements Book {

    private static final int MAX_BOOK_SIZE = 400;
    private Queue<Integer> bookPageQueue = new LinkedList<>();

    private int leftPage;
    private int rightPage;

    private static int leftnumberMultiple;

    private static int rightnumberMultiple;


    public OpenBook() {
        this.getBookPage();
    }

    @Override
    public Queue<Integer> getBookPage() {
        leftPage = getLeftPage();
        rightPage = getRightPage();
        bookPageQueue.clear();
        bookPageQueue.add(leftPage);
        bookPageQueue.add(rightPage);
//        System.out.println(bookPageQueue);
        return bookPageQueue;
    }

    @Override
    public int getLeftsumNumber() {
        leftnumberMultiple = getMuiltipleOfDigits(leftPage);
        return getSumOfDigits(leftPage);
    }

    @Override
    public int getRightsumNumber() {
        rightnumberMultiple = getMuiltipleOfDigits(rightPage);
        return getSumOfDigits(rightPage);
    }

    @Override
    public int getLeftPage() {
        return generateRandomOddNumber();
    }

    @Override
    public int getRightPage() {

        return leftPage + 1;
    }

    public static int getLeftnumberMultiple() {
        return leftnumberMultiple;
    }

    public static int getRightnumberMultiple() {
        return rightnumberMultiple;
    }

    private int generateRandomOddNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(MAX_BOOK_SIZE) + 1;
        if (randomNumber % 2 == 0) {
            randomNumber++;
        }
        return randomNumber;
    }

    private int getSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private int getMuiltipleOfDigits(int number) {
        int multiplenum = 1;
        while (number > 0) {
            multiplenum *= number % 10;
            number /= 10;
        }
        return multiplenum;
    }
}

