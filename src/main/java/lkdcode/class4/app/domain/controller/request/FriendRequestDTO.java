package lkdcode.class4.app.domain.controller.request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FriendRequestDTO {

    private final List<String[]> friendList;

    public FriendRequestDTO(String[][] list) {
        this.friendList = new ArrayList<>();
        friendList.addAll(Arrays.asList(list));
    }

    public void delete(int index) {
        friendList.remove(index);
    }

    public List<String[]> getFriendList() {
        return new ArrayList<>(friendList);
    }

}
