package lkdcode.class2.app.domain.exception;

import java.util.Arrays;

public class Filter {
    private static final String HANGUL_REGEX = "[^\\p{IsHangul}]";
    private static final String EMAIL_REGEX = "@email.com";
    private static final int MAX_LENGTH = 10000;
    private static final int EMAIL_IDX = 0;
    private static final int NICKNAME_IDX = 1;
    private static final int MIN_EMAIL_SIZE = 11;
    private static final int MAX_EMAIL_SIZE = 20;
    private static final int MIN_NICKNAME_SIZE = 1;
    private static final int MAX_NICKNAME_SIZE = 20;

    private static String[][] list;

    private Filter() {
    }

    public static void check(String[][] list) {
        Filter.list = list;
        filter();
    }

    private static void filter() {
        validateSize();
        validateEmailSize();
        validateEmailRegex();
        validateNickname();
        validateNicknameSize();
    }

    private static void validateSize() {
        if (list.length > MAX_LENGTH) {
            throw new IllegalArgumentException("크루 사이즈가 초과하였습니다. [value : " + list.length + "]");
        }
    }

    private static void validateEmailSize() {
        boolean isAnyInvalidEmailSize = Arrays.stream(list)
                .map(profile -> profile[EMAIL_IDX])
                .map(String::length)
                .anyMatch(size -> size >= MIN_EMAIL_SIZE && size < MAX_EMAIL_SIZE);

        if (!isAnyInvalidEmailSize) {
            throw new IllegalArgumentException("이메일 길이는 11자 이상 20자 미만입니다.");
        }
    }

    private static void validateEmailRegex() {
        boolean hasInvalidEmail = Arrays.stream(list)
                .map(profile -> profile[EMAIL_IDX])
                .noneMatch(email -> email.contains(EMAIL_REGEX));

        if (hasInvalidEmail) {
            throw new IllegalArgumentException("이메일 형식은 @email.com 도메인만 허용됩니다.");
        }
    }

    private static void validateNickname() {
        Arrays.stream(list)
                .map(profile -> profile[NICKNAME_IDX])
                .filter(nickname -> nickname.matches(HANGUL_REGEX))
                .findFirst()
                .ifPresent(nickname -> {
                    throw new IllegalArgumentException("닉네임에 한글이 아닌 문자가 포함되어 있습니다. [value : " + nickname + "]");
                });
    }

    private static void validateNicknameSize() {
        Arrays.stream(list)
                .map(profile -> profile[NICKNAME_IDX])
                .filter(nickname -> !(nickname.length() >= MIN_NICKNAME_SIZE && nickname.length() < MAX_NICKNAME_SIZE))
                .findFirst()
                .ifPresent(nickname -> {
                    throw new IllegalArgumentException("닉네임 길이는 1자 이상 20자 미만입니다. [value : " + nickname + "]");
                });
    }

}
