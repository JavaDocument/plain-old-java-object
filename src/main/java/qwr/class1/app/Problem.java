package qwr.class1.app;

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

    private static int validationNumber(List<Integer> list) {
        return 0;
    }


}
