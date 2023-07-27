package emilywin.class3.app.Controller;

import emilywin.class3.app.Service.Service;
import java.util.Arrays;
import java.util.List;

public class Controller{
    Service service = new Service();

    //pobi / crong 입력 받기
    public Controller(){
        List<Integer> pobi = Arrays.asList(97, 98);
        List<Integer> crong = Arrays.asList(197, 198);

        int result = start(pobi, crong);

        System.out.println("result : " + result);
    }

    public int start(List<Integer> pobi,List<Integer> crong){
        int pobiBiggerNumber = service.checkException(pobi);//예외사항 체크
        if(pobiBiggerNumber==-1) return -1;

        int crongBiggerNumber = service.checkException(crong);//예외사항 체크
        if(crongBiggerNumber==-1) return -1;

        int result = service.checkWinner(pobiBiggerNumber, crongBiggerNumber);

        return result;
    }

}
