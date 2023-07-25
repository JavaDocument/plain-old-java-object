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
            throw new RuntimeException(e.getMessage());
        }
    }

    default int calculateMaxNumber(int number) {
        String calNumber = String.valueOf(number);
        int addition = 0;
        int multiplication = 1;

        for (char digitChar : calNumber.toCharArray()) {
            int singleDigit = Character.getNumericValue(digitChar);
            addition += singleDigit;
            multiplication *= singleDigit;
        }

        return Math.max(addition, multiplication);
    }

}
