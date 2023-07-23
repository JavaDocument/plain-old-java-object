package lkdcode.class3.app.domain.page;

public sealed class LeftPage implements Page permits RightPage {
    private final int number;

    public LeftPage() {
        this.number = getPage();
    }

    public static LeftPage newInstance() {
        return new LeftPage();
    }

    @Override
    public int getMaxNumber() {
        return calculateMaxNumber(number);
    }

}
