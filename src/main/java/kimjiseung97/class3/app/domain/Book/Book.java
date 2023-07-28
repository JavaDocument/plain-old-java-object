package kimjiseung97.class3.app.domain.Book;

import java.util.List;
import java.util.Queue;

public interface Book {

    //책을 펼치는 함수
    Queue<Integer> getBookPage();

    //왼쪽 페이지 숫자를 더하는 함수
    int getLeftsumNumber();

    //오른쪽 페이지 숫자를 더하는 함수
    int getRightsumNumber();


    //왼쪽페이지를 얻는 함수
    int getLeftPage();

    //오른쪽 페이지를 얻는함수
    int getRightPage();
}
