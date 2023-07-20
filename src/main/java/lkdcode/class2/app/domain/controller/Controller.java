package lkdcode.class2.app.domain.controller;

import lkdcode.class2.app.domain.member.Crew;
import lkdcode.class2.app.domain.member.NicknameParser;

import java.util.*;

public class Controller {

    private final Set<String> checkNames;
    private final List<String> nicknameList;
    private final Crew crew;

    private NicknameParser nicknameParser;
    private String nickname;
    private String targetNickname;

    public Controller(final String[][] list) {
        this.crew = new Crew(list);
        this.checkNames = new HashSet<>();
        this.nicknameList = crew.getNicknameList();
    }

    public void solution() {
        // TODO : refactor

        for (int currentIdx = 0; currentIdx < nicknameList.size(); currentIdx++) {
            targetNickname = nicknameList.get(currentIdx);

            compare(currentIdx);
        }

        resultPrint();
    }

    private void resultPrint() {
        List<String> resultList = crew.getResultList(checkNames);

        System.out.println(resultList);
    }

    private void compare(final int currentIdx) {
        for (int compareIdx = currentIdx + 1; compareIdx < nicknameList.size(); compareIdx++) {
            nickname = nicknameList.get(compareIdx);
            nicknameParser = new NicknameParser(targetNickname);

            parser();
        }
    }

    private void parser() {
        while (!nicknameParser.isEmpty()) {
            String word = nicknameParser.dequeue();

            checkContains(word);
        }
    }

    private void checkContains(final String word) {
        if (nickname.contains(word)) {
            checkNames.add(nickname);
            checkNames.add(targetNickname);
        }
    }

}
