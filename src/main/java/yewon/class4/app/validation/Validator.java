package yewon.class4.app.validation;

public interface Validator {

    boolean validInput(String str);

    boolean validUserNameLength(String userName);
    boolean validUserNameFormat(String userName);

    boolean validFriendsLength(String[][] friends);
    boolean validFriendsFormat(String[][] friends);

    boolean validVisitorsLength(String[] visitors);
    boolean validVisitorsFormat(String[] visitors);
}
