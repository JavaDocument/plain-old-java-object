package lkdcode.class1.app.domain.operator;

public enum OperatorType {

    PLUS("+", Plus.getInstance());
    private final String type;
    private final Operator operator;

    OperatorType(String type, Operator operator) {
        this.type = type;
        this.operator = operator;
    }

    public String getType() {
        return type;
    }

    public Operator getOperator() {
        return operator;
    }

}
