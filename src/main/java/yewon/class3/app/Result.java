package yewon.class3.app;

public enum Result {
    POBI_WIN(1)
    , CRONG_WIN(-1)
    , DRAW(0)
    ;

    private int result;

    Result(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }
}