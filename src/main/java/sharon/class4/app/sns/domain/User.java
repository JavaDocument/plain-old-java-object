package sharon.class4.app.sns.domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String id;
    private List<String> friends;
    private int visitorPoint;

    public User(String id) {
        this.id = id;
        this.friends = new ArrayList<>();
        this.visitorPoint = 0;
    }

    public void addFriend(String friendId) {
        friends.add(friendId);
    }

    public List<String> getFriends() {
        return friends;
    }

    public void addVisitorPoint() {
        visitorPoint++;
    }

    public int getVisitorPoint() {
        return visitorPoint;
    }

    public String getId() {
        return id;
    }
}
