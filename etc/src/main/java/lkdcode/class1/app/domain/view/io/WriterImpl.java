package lkdcode.class1.app.domain.view.io;

public class WriterImpl implements Writer {
    @Override
    public <T> void write(T value) {
        System.out.println(value);
    }
}
