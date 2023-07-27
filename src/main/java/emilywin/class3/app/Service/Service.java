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

    public List<Integer> checkDigit(int pageNumber){
        List<Integer> eachDigit = new ArrayList<>();
        int onesDigit=0, tensDigit=0, hundredsDigit=0;
        //한자리 수인지, 두자리 수인지,세자리 수인지 확인
        int digit = (int) (Math.log10(pageNumber) + 1); //Math 함수를 사용해서 int의 길이 구하는 방법

        switch (digit) {
            case 1: //한자리 숫자일때(1~9)
                eachDigit.add(pageNumber);
                break;
            case 2: //두자리 숫자일때(10~99)
                tensDigit = pageNumber / 10;
                onesDigit = pageNumber % 10;

                eachDigit.add(tensDigit);
                eachDigit.add(onesDigit);
                break;
            case 3: //세자리 숫자일때(100~400)
                hundredsDigit = pageNumber / 100;
                tensDigit = (pageNumber /10) % 10;
                onesDigit = pageNumber % 10;

                eachDigit.add(hundredsDigit);
                eachDigit.add(tensDigit);
                eachDigit.add(onesDigit);
                break;
        }

        return eachDigit;
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

    private int addAndMultiply(List<Integer> eachDigit) {
        //왼쪽 페이지에서 더 큰 수와 오른쪽 페이지에서 더 큰 수 중 어떤것이 더 큰지를 비교해야 하는데 그걸 어떻게...??
        int add=0, multiply=1,biggerNumber=0;

        for (Integer ed :eachDigit) {
            add+=ed;
            multiply*=ed;
        }
        biggerNumber = add > multiply ? add : multiply;

        System.out.println("biggerNumber : "+biggerNumber);
        return biggerNumber;
    }

    public int checkWinner(int pobiBiggerNumber,int crongBiggerNumber){
        if(pobiBiggerNumber>crongBiggerNumber) return 1;
        else if(pobiBiggerNumber<crongBiggerNumber) return 2;
        return 0;
    }

}
