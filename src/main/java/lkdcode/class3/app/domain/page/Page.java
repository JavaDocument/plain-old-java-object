package lkdcode.class3.app.domain.page;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public sealed interface Page permits LeftPage, RightPage {

    int getMaxNumber();

    default int getPage() {
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            return instanceStrong.nextInt();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    default int calculateMaxNumber(int number) {
        String calNumber = String.valueOf(number);
        int addition = 0;
        int multiplication = 1;

        for (int singleDigitIdx = 0; singleDigitIdx < calNumber.length(); singleDigitIdx++) {
            int singleDigit = calNumber.charAt(singleDigitIdx);
            addition += singleDigit;
            multiplication *= singleDigit;
        }

        return Math.max(addition, multiplication);
    }

}
