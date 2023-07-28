package lkdcode.class4.app.domain.user;

public class User {
    private static final User INSTANCE = new User();
    private String name;

    private User() {
    }

    public static User getInstance(String name) {
        return INSTANCE;
    }
}
