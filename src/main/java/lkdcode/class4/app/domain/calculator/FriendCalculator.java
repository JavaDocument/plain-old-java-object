package lkdcode.class4.app.domain.calculator;

import lkdcode.class4.app.domain.entity.UserResult;

public class FriendCalculator implements Calculator<String[][]> {
    private final String user;

    public FriendCalculator(String user) {
        this.user = user;
    }

    @Override
    public int getScore(String[][] friendsList) {
        for (String[] friends : friendsList) {
            for (String friend : friends) {
                if (friend.equals(user)) {

                }
            }
        }
        return 0;
    }

}
