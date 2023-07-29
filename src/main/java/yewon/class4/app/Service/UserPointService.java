package yewon.class4.app.Service;

import yewon.class4.app.entity.Point;

import java.util.HashMap;

public class UserPointService {

    private final Point point;

    public UserPointService() {
        point = new Point(new HashMap<>());
    }


}
