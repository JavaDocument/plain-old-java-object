package sum.class2.app.member;

import java.util.Objects;

public class Member {

    private String email;
    private String nickName;

    public Member(String email, String nickName) {
        this.email = email;
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member member)) return false;
        return Objects.equals(email, member.email) && Objects.equals(nickName, member.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, nickName);
    }
}
