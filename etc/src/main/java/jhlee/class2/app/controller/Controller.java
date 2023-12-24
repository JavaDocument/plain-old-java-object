package jhlee.class2.app.controller;

import jhlee.class2.app.dto.request.CrewRegisterRequestDTO;
import jhlee.class2.app.entity.Crew;
import jhlee.class2.app.service.Service;
import jhlee.class2.app.viewer.Viewer;

import java.util.List;
import java.util.Queue;

public class Controller {

    private Service service;
    private Viewer viewer;

    private Controller() {}

    private Controller(Service service, Viewer viewer) {
        this.service = service;
        this.viewer = viewer;
    }

    public static Controller of(Service service, Viewer viewer) {
        return new Controller(service, viewer);
    }

    public void start() {
        viewer.showIndexPage();

        Queue<CrewRegisterRequestDTO> inputDTOQueue = viewer.showInputPage();

        viewer.printResult(service.checkValidate(inputDTOQueue));
    }

}
