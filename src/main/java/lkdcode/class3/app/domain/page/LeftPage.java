package lkdcode.class3.app.domain.page;

public final class LeftPage implements Page {
    private final int number;

    LeftPage() {
        this.number = getPageNumber();
    }

    public static LeftPage of() {
        return new LeftPage();
    }

    @Override
    public int getMaxNumber() {
        return calculateMaxNumber(number);
    }

    public RightPage getRightPage() {
        return new RightPage(number);
    }

}
