package yewon.class2.app.service;

import java.util.regex.Pattern;

import static yewon.class2.app.common.ReplaceString.replace;

public class NicknameValidator {
    // 1자 이상 20자 미만, 한글만 가능
    private final int MIN_LENGTH = 1;
    private final int MAX_LENGTH = 20;

    public boolean valid(String nickname) {
        return formatValid(nickname) && sizeValid(nickname);
    }

    private boolean formatValid(String nickname) {
        return Pattern.matches("^[ㄱ-ㅎ가-힣]*$", replace(nickname));
    }

    private boolean sizeValid(String nickname) {
        return replace(nickname).length() >= MIN_LENGTH
                && replace(nickname).length() < MAX_LENGTH;
    }

}
