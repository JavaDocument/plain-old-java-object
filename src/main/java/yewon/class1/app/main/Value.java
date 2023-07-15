package yewon.class1.app.main;

// 값을 생성하는 클래스
public class Value {
    // 필수 매개변수
    private final int number;

    public Value(ValueBuilder builder) {
        this.number = builder.number;
    }

    public int getNumber() {
        return number;
    }

    // 빌더 클래스
    public static class ValueBuilder {
        private final int number;

        public ValueBuilder(int number) {
            this.number = number;
        }

        public Value build() {
            return new Value(this);
        }
    }
}
