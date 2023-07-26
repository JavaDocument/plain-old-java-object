package sum.class3.app.user;

import sum.class3.app.util.CalculateMaxUtil;
import sum.class3.app.util.PageUtil;
import sum.class3.app.util.WinnerUtil;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private PageUtil pageUtil;
    private int leftPage;
    private int rightPage;

    public User(String name) {
        this.name = name;
        this.pageUtil = new PageUtil();
    }

    public void openBook() {
        System.out.println(name + ", 책을 펼칩니다!");
        leftPage = pageUtil.openBook();
        rightPage = leftPage + 1;
        System.out.println(name + "의 페이지: [" + leftPage + ", " + rightPage + "]");
    }

    public int calculateMax() {
        return CalculateMaxUtil.calculateMax(leftPage, rightPage);
    }






}
