package yewon.class4.app.validation;

public class ValidatorImpl implements Validator {
    /*
    - user는 길이가 1 이상 30 이하인 문자열이다.
    - friends는 길이가 1 이상 10,000 이하인 리스트/배열이다.
    - friends의 각 원소는 길이가 2인 리스트/배열로 [아이디 A, 아이디 B] 순으로 들어있다.
        - 아이디는 길이가 1 이상 30 이하인 문자열이다.
    - visitors는 길이가 0 이상 10,000 이하인 리스트/배열이다.
    */

    @Override
    public boolean validInput(String str) {
        return str != null && str.length() != 0;
    }

    @Override
    public boolean validUserNameLength(String userName) {
        return userName.length() >= 1 && userName.length() <= 30;
    }

    @Override
    public boolean validUserNameFormat(String userName) {
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if (!(c >= 97 && c <= 122)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean validFriendsLength(String[][] friends) {
        if (friends == null
                || !(friends.length >= 1)
                || !(friends.length <= 10000)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean validFriendsFormat(String[][] friends) {
        for (String[] friend : friends) {
            if (!validUserNameLength(friend[0])
                    || !validUserNameLength(friend[1])
                    || !validUserNameFormat(friend[0])
                    || !validUserNameFormat(friend[1])
            ) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean validVisitorsLength(String[] visitors) {
        return visitors.length <= 10000;
    }

    @Override
    public boolean validVisitorsFormat(String[] visitors) {
        for (String visitor : visitors) {
            if (!validUserNameLength(visitor) || !validUserNameFormat(visitor)) {
                return false;
            }
        }
        return true;
    }

}
