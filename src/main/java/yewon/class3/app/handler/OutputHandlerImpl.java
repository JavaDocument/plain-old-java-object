package yewon.class3.app.handler;

public class OutputHandlerImpl implements OutputHandler {

    @Override
    public void message(int result) {
        System.out.println(result);
    }

    @Override
    public void message(String result) {
        System.out.println(result);
    }
}
