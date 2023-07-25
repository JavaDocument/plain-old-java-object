package lkdcode.class3.app.domain.page;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public sealed interface Page permits LeftPage, RightPage {
    int MAX_SIZE = 400;
    int MIN_SIZE = 1;

    int getMaxNumber();

    default int getPageNumber() {
        try {
            SecureRandom random = SecureRandom.getInstanceStrong();
            return random.nextInt(MAX_SIZE) + MIN_SIZE;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    default int calculateMaxNumber(int number) {
        String calNumber = String.valueOf(number);
        int addition = 0;
        int multiplication = 1;

        for (int singleDigitIdx = 0; singleDigitIdx < calNumber.length(); singleDigitIdx++) {
            int singleDigit = (int) calNumber.charAt(singleDigitIdx) - 48;

            addition += singleDigit;
            multiplication *= singleDigit;
        }

        return Math.max(addition, multiplication);
    }

}
