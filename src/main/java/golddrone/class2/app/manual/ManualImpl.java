package golddrone.class2.app.manual;

public class ManualImpl implements Manual{

    private static Integer count = 1;

    @Override
    public void crewInputOutput() {
        System.out.println();
        increaseCount();
    }

    @Override
    public void increaseCount() {
        count++;
    }


}
