package golddrone.class1.app;

public class ScreenImpl implements Screen{
    /**
     * 결과값을 출력한다
     * @param result 계산된 결과값
     */
    @Override
    public void output(Long result) {
        System.out.println(result);
    }
}
