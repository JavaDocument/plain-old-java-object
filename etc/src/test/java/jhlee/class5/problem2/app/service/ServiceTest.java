package jhlee.class5.problem2.app.service;

import jhlee.class5.problem2.app.dto.request.RequestDTO;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    private static final Service service = Service.newInstance();

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i + "-" + service.calculateClapCount(new RequestDTO(String.valueOf(i))).clapCount());
        }
    }

}