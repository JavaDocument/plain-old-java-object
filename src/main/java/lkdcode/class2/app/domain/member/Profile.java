package lkdcode.class2.app.domain.member;

public record Profile(String email, String nickname) {
    private static final int EMAIL_IDX = 0;
    private static final int NAME_IDX = 1;

    private Profile(String[] profile) {
        this(profile[EMAIL_IDX], profile[NAME_IDX]);
    }

    public static Profile of(String[] profile) {
        return new Profile(profile);
    }

}
