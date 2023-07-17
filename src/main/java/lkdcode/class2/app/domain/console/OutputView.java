package lkdcode.class2.app.domain.console;

public final class OutputView implements Output {

    @Override
    public <T> void output(T value) {
        System.out.println(value);
    }
}
