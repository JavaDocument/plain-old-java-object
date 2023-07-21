package yewon.class2.app.service;

import static yewon.class2.app.common.ReplaceString.replace;

public class EmailValidator {
    private final String EMAIL_FORMAT = "@email.com";
    // 11자 이상, 20자 미만
    private final int MIN_LENGTH = 11;
    private final int MAX_LENGTH = 20;

    public boolean valid(String email) {
        return formatValid(email) && sizeValid(email);
    }

    private boolean formatValid(String email) {
        return replace(email).endsWith(EMAIL_FORMAT);
    }

    private boolean sizeValid(String email) {
        return replace(email).length() >= MIN_LENGTH
                && replace(email).length() < MAX_LENGTH;
    }

}
