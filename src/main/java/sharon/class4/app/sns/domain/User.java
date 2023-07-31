package sharon.class4.app.sns.domain;

public class User {

    public String id;
    private int friends;
    private int visitor;


    public User(String id) {
        this.id = id;
        this.friends = 0;
        this.visitor = 0;
    }

    public void addFriendPoint() {
        friends += 10;
    }

    public void addVisitorPoint() {
        visitor += 1;
    }
}
