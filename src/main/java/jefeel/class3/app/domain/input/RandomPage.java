package jefeel.class3.app.domain.input;


public class RandomPage {


    private static final int MIN_PAGE = 3;
    private static final int MAX_PAGE = 398;

    //    public RandomPage(int first, int second){
//    }
    public static int randomPage() {
        int n = ((int) (Math.random() * MAX_PAGE + MIN_PAGE));
        return (n % 2 == 0) ? n - 1 : n;
    }


}
