package lkdcode.class4.app.domain.entity;

import java.util.ArrayList;
import java.util.List;

public record UserVisit(List<String> list) {

    public static UserVisit getInstance() {
        return new UserVisit(new ArrayList<>());
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }

    public void addVisitor(String name) {
        list.add(name);
    }

}
