package jhlee.class5.problem2.app.service;

import jhlee.class5.problem2.app.dto.request.RequestDTO;
import jhlee.class5.problem2.app.dto.response.ResponseDTO;
import jhlee.class5.problem2.app.util.Util;

import java.util.LinkedList;
import java.util.Queue;

public class Service {
    private Service() {
    }

    public static Service newInstance() {
        return new Service();
    }

    public ResponseDTO calculateClapCount(RequestDTO dto) {
        String number = dto.number();
        int clapCount = 0;
        int length = number.length();

        Queue<Integer> digitQueue = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            digitQueue.add(Util.charToInt(number.charAt(i)));
        }

        boolean[] isDigitTriple = new boolean[length];
        for (int i = 0; i < length; i++) {
            int exponent = length - i - 1;
            if (digitQueue.peek() == null) break;
            Integer polled = digitQueue.poll();
            int digit = exponent == 0 ? polled + 1 : polled;

            double divided = digit / 3.0;
            int quotient = (int) divided;
            double remain = divided - quotient;

            if (digit != 0 && remain == 0) {
                isDigitTriple[i] = true;
            }

            int nth = (int) Math.pow(10, exponent);
            clapCount += 3 * exponent * nth * digit / 10;

            int nthAdditionalClap = remain == 0 && quotient != 0 ? quotient - 1 : quotient;
            clapCount += nthAdditionalClap * nth;

            int additionalClap = calculateAdditional(i, isDigitTriple);
            clapCount += additionalClap * digit * nth;
        }

//        반복 버전
//        int number2 = Integer.parseInt(dto.number());
//        int clapCount2 = 0;
//
//        for (int i = 1; i <= number2; i++) {
//            int num = i;
//            while (num != 0) {
//                int digit = num % 10;
//                if (digit % 3 == 0 && digit != 0) clapCount2++;
//                num /= 10;
//            }
//        }
//
//        if (clapCount != clapCount2) throw new RuntimeException("틀림");

        return new ResponseDTO(clapCount);
    }

    private static int calculateAdditional(int i, boolean[] isDigitTriple) {
        int additionalClap = 0;

        for (int j = 0; j < i; j++) {
            if (isDigitTriple[j]) additionalClap++;
        }

        return additionalClap;
    }

}
