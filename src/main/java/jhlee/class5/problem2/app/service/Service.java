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
        int number = Integer.parseInt(dto.number());
        int clapCount = 0;

        for (int i = 1; i <= number; i++) {
            int num = i;
            while (num != 0) {
                int digit = num % 10;
                if (digit % 3 == 0 && digit != 0) clapCount++;
                num /= 10;
            }
        }

        return new ResponseDTO(clapCount);
    }

}
