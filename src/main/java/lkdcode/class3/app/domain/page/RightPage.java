package lkdcode.class3.app.domain.page;

public final class RightPage extends LeftPage implements Page {
    private final int number;
    private final int NEXT_PAGE_IDX = 1;

    public RightPage() {
        this.number = super.getMaxNumber() + NEXT_PAGE_IDX;
    }

    public static RightPage newInstance() {
        return new RightPage();
    }

    @Override
    public int getMaxNumber() {
        return calculateMaxNumber(number);
    }

}
