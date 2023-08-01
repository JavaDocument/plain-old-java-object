package lkdcode.class4.app.domain.controller.request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VisitorRequestDTO {

    private final List<String> visitorList;

    private VisitorRequestDTO(final String[] list) {
        this.visitorList = new ArrayList<>();
        visitorList.addAll(Arrays.asList(list));
    }

    public static VisitorRequestDTO toDTO(final String[] entity) {
        return new VisitorRequestDTO(entity);
    }

    public List<String> getVisitorList() {
        return new ArrayList<>(visitorList);
    }

}
