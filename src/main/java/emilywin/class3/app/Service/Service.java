package emilywin.class3.app.Service;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public int checkException(List<Integer> player) {
        int leftPage = player.get(0), rightPage = player.get(1);
        //이어져있는 페이지인지 체크 / 왼쪽 페이지는 홀수, 오른쪽 페이지는 짝수인지
        if((rightPage - leftPage)!=1|| leftPage%2!=1|| rightPage%2!=0)
            return -1;

        return checkBiggerNumber(player);
    }

    public int checkBiggerNumber(List<Integer> player){
        int biggerNumber=0;
        for (Integer playerPage: player) {
            List<Integer> eachDigit = checkDigit(playerPage); //각 자리수 받음
            //각 자리수 다 더하거나 곱하는 함수
            int i = addAndMultiply(eachDigit);
            if(biggerNumber<=i) biggerNumber=i;
        }
        return biggerNumber;
    }

    public List<Integer> checkDigit(int pageNumber){
        List<Integer> eachDigit = new ArrayList<>();

        while(pageNumber!=0){
            eachDigit.add(pageNumber%10);
            pageNumber /= 10;
        }

        return eachDigit;
    }

    private int addAndMultiply(List<Integer> eachDigit) {
        int add=0, multiply=1,biggerNumber=0;

        for (Integer ed : eachDigit) {
            add+=ed;
            multiply*=ed;
        }
        System.out.println("add : "+add);
        System.out.println("multiply : "+multiply);
        biggerNumber = add > multiply ? add : multiply;

        return biggerNumber;
    }

    public int checkWinner(int pobiBiggerNumber,int crongBiggerNumber){
        if(pobiBiggerNumber>crongBiggerNumber) return 1;
        else if(pobiBiggerNumber<crongBiggerNumber) return 2;
        return 0;
    }

}
