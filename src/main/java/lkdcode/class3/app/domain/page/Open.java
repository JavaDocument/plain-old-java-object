package lkdcode.class3.app.domain.page;

public class Open implements Book {

    private final LeftPage leftPage;
    private final RightPage rightPage;

    public Open() {
        this.leftPage = LeftPage.newInstance();
        this.rightPage = leftPage.getRightPage();
    }

    public static Book newInstance() {
        return new Open();
    }

    @Override
    public int getMaxNumber() {
        int leftPageNumber = leftPage.getMaxNumber();
        int rightPageNumber = rightPage.getMaxNumber();

        return Math.max(leftPageNumber, rightPageNumber);
    }

}
