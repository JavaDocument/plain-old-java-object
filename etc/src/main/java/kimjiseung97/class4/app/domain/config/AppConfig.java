package kimjiseung97.class4.app.domain.config;

public class AppConfig {

    private final String[][] friends;
    private final String[] visitors;
    private final String user;

    public AppConfig() {
        friends = new String[][] {{"donut", "andole"}, {"donut", "jun"}, {"donut", "mrko"}, {"shakevan", "andole"}, {"shakevan", "jun"}, {"shakevan", "mrko"}};
        visitors = new String[]{"bedi", "bedi", "donut", "bedi", "shakevan"};
        user = "mrko";
    }

    public String[][] getFriends() {
        return friends;
    }

    public String[] getVisitors() {
        return visitors;
    }

    public String getUser() {
        return user;
    }



}
