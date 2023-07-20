package yewon.class2.app.controller;

import yewon.class2.app.handler.InputHandler;
import yewon.class2.app.handler.OutputHandler;
import yewon.class2.app.repository.Crew;
import yewon.class2.app.repository.CrewList;
import yewon.class2.app.service.DuplicateValidator;
import yewon.class2.app.service.EmailValidator;
import yewon.class2.app.service.NicknameValidator;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Controller {

    private final InputHandler input;
    private final OutputHandler output;
    private final DuplicateValidator duplicateValidator;
    private final EmailValidator emailValidator;
    private final NicknameValidator nicknameValidator;
    private List<String> duplicateEmailList;

    public Controller() {
        nicknameValidator = new NicknameValidator();
        emailValidator = new EmailValidator();
        duplicateValidator = new DuplicateValidator();
        input = new InputHandler();
        output = new OutputHandler();
        on();
    }

    private void on() {
        output.message("크루 정보 입력 => ");
        String inputCrewData = input.input();
        parseCrew(inputCrewData);
        solution();
    }

    private void solution() {
        duplicateEmailList = duplicateValidator.validNickname();
        if (duplicateEmailList.size() > 0) {
            String result = duplicateEmailList.stream().distinct().sorted().toList().toString();
            output.message("result = " + result);
            return;
        }
        output.message("중복없음!");
    }

    private void parseCrew(String crewData) {
        String substrCrewData = crewData.substring(2, crewData.length() - 2);
        String[] crewDataArray = substrCrewData.split("], ?\\[");
        for (String crew : crewDataArray) {
            String[] splitCrew = crew.split(", | ");
            if (!emailValidator.valid(splitCrew[0]) && nicknameValidator.valid(splitCrew[1])) {
                return;
            }
            CrewList.getInstance().setCrewList(new Crew(splitCrew[0], splitCrew[1]));
        }
    }

}
