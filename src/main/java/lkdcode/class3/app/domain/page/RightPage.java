package lkdcode.class3.app.domain.page;

public final class RightPage implements Page {
    private final int number;
    private final int NEXT_PAGE_IDX = 1;

    public RightPage(int number) {
        this.number = number + NEXT_PAGE_IDX;
    }

    @Override
    public int getMaxNumber() {
        return calculateMaxNumber(number);
    }

}
