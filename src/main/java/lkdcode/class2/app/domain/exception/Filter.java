package lkdcode.class2.app.domain.exception;

public class Filter {
    private static final String HANGUL_REGEX = "[^\\p{IsHangul}]";
    private static final int EMAIL_IDX = 0;
    private static final int NICKNAME_IDX = 1;
    private static final String EMAIL_REGEX = "@email.com";
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
        if (list.length > 10000) {
            throw new IllegalArgumentException("크루 사이즈가 초과하였습니다. [value : " + list.length + "]");
        }
    }

    private static void validateEmailSize() {
        for (String[] profile : list) {
            String email = profile[EMAIL_IDX];
            int length = email.length();

            if (length >= MIN_EMAIL_SIZE && length < MAX_EMAIL_SIZE) continue;
            throw new IllegalArgumentException("이메일 길이는 11자 이상 20자 미만입니다. [value : " + email + "]");
        }
    }

    private static void validateEmailRegex() {
        for (String[] profile : list) {
            String email = profile[EMAIL_IDX];

            if (!email.contains(EMAIL_REGEX)) {
                throw new IllegalArgumentException("이메일 형식은 @email.com 도메인만 허용됩니다. [value : " + email + "]");
            }
        }
    }

    private static void validateNickname() {
        for (String[] profile : list) {
            String nickname = profile[NICKNAME_IDX];

            boolean isNonKorean = nickname.matches(HANGUL_REGEX);

            if (isNonKorean) {
                throw new IllegalArgumentException("닉네임에 한글이 아닌 문자가 포함되어 있습니다. [value : " + nickname + "]");
            }
        }
    }

    private static void validateNicknameSize() {
        for (String[] profile : list) {
            String nickname = profile[NICKNAME_IDX];
            int length = nickname.length();

            if (length >= MIN_NICKNAME_SIZE && length < MAX_NICKNAME_SIZE) continue;
            throw new IllegalArgumentException("닉네임 길이는 1자 이상 20자 미만입니다. [value : " + nickname + "]");
        }
    }

}
