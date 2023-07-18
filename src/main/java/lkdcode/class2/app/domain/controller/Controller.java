package lkdcode.class2.app.domain.controller;

import lkdcode.class2.app.domain.console.Input;
import lkdcode.class2.app.domain.console.InputView;
import lkdcode.class2.app.domain.console.Output;
import lkdcode.class2.app.domain.console.OutputView;
import lkdcode.class2.app.domain.member.Crew;
import lkdcode.class2.app.domain.member.CrewList;
import lkdcode.class2.app.domain.member.Profile;
import lkdcode.class2.app.domain.service.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Controller {
    private final Input input = new InputView();
    private final Output output = new OutputView();
    private final Duplicator duplicator = new DuplicatorImpl();
    private final Separator separator = new SeparatorImpl();
    private final Validator validator = new ValidatorImpl();


    public Controller() {
    }

    public void solution(String[][] list) {
        // TODO : refactor

        CrewList crewList = new CrewList(list);
        List<String> emailList = crewList.getEmailList();
        List<String> nicknameList = crewList.getNicknameList();

        // valid
        if (!validator.checkSize(crewList.get())
                && !validator.checkEmailSize(emailList)
                && !validator.checkEmailSize(emailList)
                && !validator.checkNickname(nicknameList)) {
            return;
        }

        // logic
        nicknameList.stream()
                .map(separator::split)
                .forEach(System.out::println);
    }
}
