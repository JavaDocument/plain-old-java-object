package lkdcode.class2.app.domain.console;

public sealed interface Output permits OutputView {
    <T> void output(T value);
}
