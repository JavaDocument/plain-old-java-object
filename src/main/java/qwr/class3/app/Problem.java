package qwr.class3.app;

import java.util.List;

public class Problem {

    public static int solution(List<Integer> pobi, List<Integer> crong) {

        int pobiNumber = validationNumber(pobi);
        int crongNumber = validationNumber(crong);
        int answer;

        if (pobiNumber == crongNumber) {
            answer = 0;
        } else if (pobiNumber == -1 || crongNumber == -1) {
            answer = -1;
        } else {
            answer = (pobiNumber > crongNumber) ? 1 : 2;
        }
        return answer;
    }

    //list에 대한 유효성 검사 - list empty거나, 페이지 번호가 연속되지 않거나, 첫번쨰 번호가 홀수가 아닌경우, 두번째 번호가 짝수가 아닌경우
    public static int validationNumber(List<Integer> list) {

        //리스트 size = 2
        //리스트가 비어있거나 길이가 2가 아니라면 유효하지 않은 값임으로 -1 반환 / [두페이지의 숫자가 연속적이지 않는경우] - 코드가 어렵
        if (list == null || list.size() != 2 || list.get(1) != list.get(0) + 1 ||
                // 두 번째 페이지 번호가 첫 번째 페이지 번호에서 1만큼 증가하지 않는다면 결과로 -1을 반환
                list.get(0) % 2 != 1 || list.get(1) % 2 != 0 ||
                //리스트의 첫번째 번호가 홀수인지 확인, 짝수인지 확인 - 유효하지않다면 -1 반환
                greaterNumber(list.get(0)) == -1 || greaterNumber(list.get(1)) == -1) {
            return -1;
        }

        // 두 페이지 번호를 greaterNumber 메서드에 넣어서 더 큰 값을 계산
        return Math.max(greaterNumber(list.get(0)), greaterNumber(list.get(1)));
    }



    //자리수 구하기
//총 400페이지로 valueNum을 입력 받는다. 1~400의 범위 밖의 숫자는 예외로 -1을 return한다
    public static int countNumber(int valueNum) {
        if (valueNum <= 1 || valueNum >= 400)
            return -1;

        int count = 0; //초기값 카운트 0으로 설정
        while (valueNum > 0) {
            valueNum = valueNum / 10; //givenNum을 10으로 나누어서 자리수를 하나씩 줄임
            count++; // 자리수를 하나 줄일때마다 count 1를 증가시킴
        }
        return count; //최종적으로 구해진 카운트 반환
    }

    public static int greaterNumber(int num) {
        //자리수 구하기 1,2,3
        int digitNum = countNumber(num);

        if (digitNum == 1) {
            return 1; // 1자리 수는 그 자체가 최대값
        } else if (digitNum == 2) { //2자리 수 분리 후 더한 값과 곱한 값 나열 후 최대값 구하기
            // % : 나머지를 구하는 연산자
            int oneDigit = num % 10;
            int tensDigit = num / 10 % 10;
            return Math.max(oneDigit + tensDigit, oneDigit * tensDigit);
        } else if (digitNum == 3) {
            int oneDigit = num % 10;
            int tensDigit = num / 10 % 10;
            int hundredDigit = num / 100;
            return Math.max(oneDigit + tensDigit + hundredDigit, oneDigit * tensDigit * hundredDigit);
        } else {
            return -1; // 4자리 이상의 수는 처리하지 않으므로 -1을 반환합니다.
        }
    }


}
