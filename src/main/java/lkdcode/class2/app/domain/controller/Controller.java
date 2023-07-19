package lkdcode.class2.app.domain.controller;

import lkdcode.class2.app.domain.member.Crew;
import lkdcode.class2.app.domain.member.NicknameParser;

import java.util.*;

public class Controller {

    public void solution(String[][] list) {
        // TODO : refactor
        Crew crew = new Crew(list);

        Set<String> duplicateNicknames = new HashSet<>();
        List<String> nicknameList = crew.getNicknameList();

        for (int i = 0; i < nicknameList.size(); i++) {
            String nickname = nicknameList.get(i);

            for (int j = i + 1; j < nicknameList.size(); j++) {
                String target = nicknameList.get(j);
                NicknameParser nicknameParser = new NicknameParser(nickname);

                while (!nicknameParser.isEmpty()) {
                    String word = nicknameParser.dequeue();

                    if (target.contains(word)) {
                        duplicateNicknames.add(target);
                        duplicateNicknames.add(nickname);
                        break;
                    }
                }
            }

        }

        PriorityQueue<String> resultList = crew.getResultList(duplicateNicknames);

        System.out.println(resultList);

    }
}
