package yewon.class2.app.controller;

import yewon.class2.app.handler.InputHandler;
import yewon.class2.app.handler.OutputHandler;
import yewon.class2.app.repository.Crew;
import yewon.class2.app.repository.CrewList;
import yewon.class2.app.service.Service;
import yewon.class2.app.service.Validator;

import java.util.LinkedList;
import java.util.List;

public class Controller {

    private final InputHandler input;
    private final OutputHandler output;
    private final Validator validator;
    private final Service service;
    private List<String> duplicateList;

    public Controller() {
        input = new InputHandler();
        output = new OutputHandler();
        validator = new Validator();
        service = new Service(new LinkedList<>());
        on();
    }

    private void on() {
        output.message("크루 정보 입력 => ");
        String inputCrewData = input.input();
        validator.crewListValid(inputCrewData);
        setCrewList(inputCrewData);
        validator.crewListLengthValid();
        solution();
    }


    private void solution() {
        duplicateList = service.findDuplicateNickname();
        if (duplicateList.size() > 0) {
            String result = duplicateList.stream().distinct().sorted().toList().toString();
            output.message("result : " + result);
            return;
        }
        output.message("👍 중복없음!");
    }

    private void setCrewList(String inputCrewData) {
        for (String crewList : parseArray(inputCrewData)) {
            String[] crew = crewList.split(", | ");
            validator.crewValid(crew);
            CrewList.getInstance().setCrewList(new Crew(crew[0], crew[1])); // [0]="이메일", [1]="닉네임"
        }
    }

    private String[] parseArray(String inputCrewData) {
        String substrCrewData = inputCrewData.substring(2, inputCrewData.length() - 2);
        return substrCrewData.split("], ?\\[");
    }
}
