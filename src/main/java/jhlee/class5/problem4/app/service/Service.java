package jhlee.class5.problem4.app.service;

import jhlee.class5.problem4.app.dto.request.RequestDTO;
import jhlee.class5.problem4.app.dto.response.ResponseDTO;

public class Service {
    private Service() {}
    public static Service newInstance() {
        return new Service();
    }
    public ResponseDTO countWon(RequestDTO dto) {
        int money = dto.money();
        // 배열의 길이는 항상 9이다. 오만, 만, 오천, 천, 오백, 백, 오십, 십, 일
        int[] result = new int[9];

        // 만으로 나누어 몫과 나머지를 구한다.
        // 오로 나누어 몫과 나머지를 구한다.
        // 나머지는 자동으로 만원의 개수이다.
        // 천으로 나누어 몫과 나머지를 구한다.
        // 오로 나누어 몫과 나머지를 구한다.
        // 백으로 나누어
        // 오로 ...
        // 십으로 ...
        // 오로
        // -> 반복문으로 한번에 쓸 수 있다.
        for (int i = 4; i > 0; i--) {
            int exponent = (int) Math.pow(10, i);
            int quotient = money / exponent;
            money %= exponent;

            result[8 - (i * 2)] = quotient / 5;
            result[9 - (i * 2)] = quotient % 5;
        }


        // 남은것은 일원의 개수이다.
        result[8] = money;

        return new ResponseDTO(result);
    }
}
