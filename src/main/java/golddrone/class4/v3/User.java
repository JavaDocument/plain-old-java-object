package golddrone.class4.v3;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private Map<String, Integer> friends;

    public User() {
        this.name = name;
        this.friends = new HashMap<>();
    }

    public User(String name) {
        this.name = name;
        this.friends = new HashMap<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getFriends() {
        return friends;
    }

    public void setFriends(Map<String, Integer> friends) {
        this.friends = friends;
    }


}
