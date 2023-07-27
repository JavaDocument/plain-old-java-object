package lkdcode.class3.app.domain.page;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public sealed interface Page permits LeftPage, RightPage {

    int getMaxNumber();

    default int getPageNumber() {
        final int INCREMENT_VALUE = 1;
        final int MAX_SIZE = 398;
        final int MIN_SIZE = 3;

        try {
            SecureRandom random = SecureRandom.getInstanceStrong();
            return random.nextInt(MAX_SIZE - MIN_SIZE + INCREMENT_VALUE) + MIN_SIZE;
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
