package jhlee.class3.app.service;

import jhlee.class3.app.dto.response.PlayResultResponseDTO;
import jhlee.class3.app.entity.FinalNumber;

public class Service {

    private static final Integer MAX_PAGE = 400;

    private Service() {

    }

    public static Service newInstance() {
        return new Service();
    }

    public PlayResultResponseDTO playOneGame() {
        int pobiEvenNumber = getRandomEvenNumber() << 1;
        int crongEvenNumber = getRandomEvenNumber() << 1;

        FinalNumber pobiFinalNumber = FinalNumber.of(pobiEvenNumber);
        FinalNumber crongFinalNumber = FinalNumber.of(crongEvenNumber);

        int result = getResult(pobiFinalNumber.getResultNumber(), crongFinalNumber.getResultNumber());

        return PlayResultResponseDTO.of(new int[]{pobiEvenNumber - 1, pobiEvenNumber}, new int[]{crongEvenNumber - 1, crongEvenNumber}, result);
    }

    private int getRandomEvenNumber() {

        return (int) (Math.random() * ((MAX_PAGE >> 1) - 1) + 1);

    }

    private int getResult(int pobiResultNumber, int crongResultNumber) {

        int result = 0;

        if (pobiResultNumber > crongResultNumber) {
            result = 1;
        } else if (pobiResultNumber < crongResultNumber) {
            result = 2;
        }

        return result;

    }

}
