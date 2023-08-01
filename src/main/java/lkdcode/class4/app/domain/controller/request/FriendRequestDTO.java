package lkdcode.class4.app.domain.controller.request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FriendRequestDTO {

    private final List<String[]> friendList;

    private FriendRequestDTO(final String[][] list) {
        this.friendList = new ArrayList<>();
        friendList.addAll(Arrays.asList(list));
    }

    public static FriendRequestDTO toDTO(String[][] entity) {
        return new FriendRequestDTO(entity);
    }

    public List<String[]> getFriendList() {
        return new ArrayList<>(friendList);
    }

}
