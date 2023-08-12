package jefeel.class3.app.domain.input;


public class RandomPage {


    private static final int MIN_PAGE = 3;
    private static final int MAX_PAGE = 395;

    // static 안 하면 지역변수로 설정해야됨

    // static 안 하면 controller에서 호출할때 오류가 걸림
    public static int randomPage() {
        int n = ((int) (Math.random() * MAX_PAGE + MIN_PAGE));
        return (n % 2 == 0) ? n - 1 : n;
    }


}
