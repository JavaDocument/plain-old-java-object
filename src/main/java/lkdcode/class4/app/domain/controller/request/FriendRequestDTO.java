package lkdcode.class4.app.domain.controller.request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FriendRequestDTO {

    private final List<String[]> friendList;

    public FriendRequestDTO(final String[][] list) {
        this.friendList = new ArrayList<>();
        friendList.addAll(Arrays.asList(list));
    }

    public void removeKnownFriend(final String name) {
        Iterator<String[]> list = friendList.listIterator();

        while (list.hasNext()) {
            String[] array = list.next();

            for (String checkName : array) {
                if (checkName.contains(name)) {
                    list.remove();
                }
            }
        }

    }

    public List<String[]> getFriendList() {
        return new ArrayList<>(friendList);
    }

}
