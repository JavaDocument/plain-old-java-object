package lkdcode.class4.app.domain.user;

public enum PointType {

    FRIEND(10), VISITOR(1);

    private final int point;

    PointType(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

}
