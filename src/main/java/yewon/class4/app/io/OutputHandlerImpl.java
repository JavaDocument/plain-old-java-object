package yewon.class4.app.io;

public class OutputHandlerImpl<T> implements OutputHandler<T> {
    @Override
    public void message(T message) {
        System.out.print(message);
    }
}
