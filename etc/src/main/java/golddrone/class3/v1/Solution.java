package golddrone.class3.v1;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    // 무승부
    public final int TIE = 0;
    // 승리
    public final int VICTORY = 1;
    // 패배
    public final int DEFEAT = 2;
    // 예외사항
    public final int ERROR = -1;

    // 책을 임의로 펼치는 메서드
    private int randomPage(){
        int oddPage = -1;
        do {
            oddPage = (int)(Math.random() * 400) + 1;
        } while (oddPage%2==0);
        return oddPage;  // 1 ~ 399 ( 홀수만!)
    }



    // 각 자리를 추출해서 리스트로 만드는 메서드
    private List<Integer> digitExtraction(int page){
        List<Integer> digitList = null;

        while (page!=0){
            if(digitList == null){
                digitList = new ArrayList<>();
            }
            int units  = page % 10;
            page /= 10;
            digitList.add(units);
        }
        return digitList;
    }

    // 각 자리 숫자를 모두 더하는 메서드
    private int digitSum(List<Integer> digitList){
        return digitList.stream()
                .mapToInt(integer -> integer)
                .sum();
    }

    // 각 자리 숫자를 모두 곱하는 메서드
    private int digitMultiple(List<Integer> digitList){
        return digitList.stream()
                .mapToInt(integer -> integer)
                .reduce(1, (a, b) -> a * b);
    }

    // 가장 큰 수를 반환하는 메서드
    private int maxNumber(int sumResult, int multiResult){
        return Math.max(sumResult,multiResult);
    }

    // 최종 점수를 비교하는 메서드
    private int finalScore(int meScore, int opponentScore){
        return switch (Integer.compare(meScore, opponentScore)) {
            case 0 -> TIE;
            case 1 -> VICTORY;
            case -1 -> DEFEAT;
            default -> ERROR;
        };
    }

    // 페이지 정보를 보여주는 메서드
    private void userInfo(User user){
        System.out.println("😂😒🤣😁😊😘");
        System.out.println(user.name() + "님의 정보");
        System.out.println("왼쪽 페이지 : " + user.leftPage());
        System.out.println("오른쪽 페이지 : " + user.rightPage());
        System.out.println("😂😒🤣😁😊😘");
    }

    // 공백을 생성해주는 메서드
    private void gap(){
        System.out.println();
        System.out.println();
    }


    // 승부를 내는 메서드
    // 포비가 이기면 1, 크롱이 이기면 2, 무승부는 0, 예외사항 -1
    public void solution(){
        int mePage = randomPage();
        int opponentPage = randomPage();
        User pobi = new User("pobi", mePage, mePage+1);
        User crong = new User("crong", opponentPage, opponentPage+1);


        // User error = new User("crong", 500, -500);
        userInfo(pobi);
        gap();
        userInfo(crong);
        List<Integer> pobiLeftList = digitExtraction(pobi.leftPage());
        List<Integer> pobiRightList = digitExtraction(pobi.rightPage());

        int pobiSum = maxNumber(digitSum(pobiLeftList), digitSum(pobiRightList));
        int pobiMultiple = maxNumber(digitMultiple(pobiLeftList), digitMultiple(pobiRightList));
        int pobiResult = maxNumber(pobiSum, pobiMultiple);

        List<Integer> crongLeftList = digitExtraction(crong.leftPage());
        List<Integer> crongRightList= digitExtraction(crong.rightPage());

        int crongSum = maxNumber(digitSum(crongLeftList), digitSum(crongRightList));
        int crongMultiple = maxNumber(digitMultiple(crongLeftList), digitMultiple(crongRightList));
        int crongResult = maxNumber(crongSum, crongMultiple);

        int result = finalScore(pobiResult, crongResult);

        System.out.println("🆒🆒🆒 Score 🆒🆒🆒");
        System.out.println("pobi 점수 : " + pobiResult);
        System.out.println("crong 점수 : " + crongResult);
        System.out.println("두구두구 결과는? " + result);
        System.out.println("🆒🆒🆒 😎😎😎 🆒🆒🆒");
    }



}
