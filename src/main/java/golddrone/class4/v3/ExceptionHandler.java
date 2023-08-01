package golddrone.class4.v3;

public class ExceptionHandler {

    private final int MIN_USER_LENGTH = 1;
    private final int MAX_USER_LENGTH = 30;
    private final int MIN_FRIENDS_LENGTH = 1;
    private final int MAX_FRIENDS_LENGTH = 10000;

    private final int MIN_VISITORS_LENGTH = 0;
    private final int MAX_VISITORS_LENGTH = 10000;



    public void userValidate(String user){
        if(!(MIN_USER_LENGTH<=user.length()
                && user.length()<=MAX_USER_LENGTH))
            throw new IllegalArgumentException("user의 길이는 1이상 30이하의 문자열입니다.");
    }


    private void friendsValidate(String[][] friends ) {
        if(!(MIN_FRIENDS_LENGTH<=friends.length
                && friends.length<=MAX_FRIENDS_LENGTH)){
            throw new IllegalArgumentException("friends의 길이는 1이상 10000이하의 배열입니다.");
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends[i].length; j++) {
                userValidate(friends[i][j]);
            }
        }
    }

    private void visitorValidate(String[] visitors){
        if(!(MIN_VISITORS_LENGTH<=visitors.length
                && visitors.length<=MAX_VISITORS_LENGTH)){
            throw new IllegalArgumentException("visitors는 길이가 0이상 10000이하입니다.");
        }
    }

}
