package yewon.class2.app.repository;

public class Crew {

    private final String email;
    private final String nickname;

    public Crew(String email, String nickname) {
        this.email = email;
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
