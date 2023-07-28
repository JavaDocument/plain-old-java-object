package lkdcode.class4.app.domain.user;

public class Member {
    private final String name;
    private int recommendedScore;

    public Member(String name) {
        this.name = name;
    }

    public void addScore(int addScore) {
        recommendedScore += addScore;
    }

    public String getName() {
        return name;
    }

    public int getRecommendedScore() {
        return recommendedScore;
    }

}
