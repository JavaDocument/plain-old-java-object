package yewon.class2.app.service;

import yewon.class2.app.repository.Crew;
import yewon.class2.app.repository.CrewList;

import java.util.LinkedList;
import java.util.List;

public class DuplicateValidator {

    private final int SUB_LENGTH = 2;
    private List<String> duplicateEmailList;

    public DuplicateValidator() {
        this.duplicateEmailList = new LinkedList<>();
    }

    // TODO : 수정
    public List<String> validNickname() {
        List<Crew> crewList = CrewList.getInstance().getCrewList();
        for (int i = 0; i < crewList.size() - 1; i++) {
            Crew prevCrew = crewList.get(i);
            for (int j = i + 1; j < crewList.size(); j++) {
                Crew nextCrew = crewList.get(j);
                if (isDuplicate(prevCrew.getNickname(), nextCrew.getNickname())) {
                    duplicateEmailList.add(prevCrew.getEmail());
                    duplicateEmailList.add(nextCrew.getEmail());
                }
            }
        }
        return duplicateEmailList;
    }

    // 중복되면 true
    private boolean isDuplicate(String prevNickname, String nextNickname) {
        for (int i = 0; i < prevNickname.length() - SUB_LENGTH; i++) {
            String subPrevNickname = prevNickname.substring(i, i + SUB_LENGTH);
            if (nextNickname.contains(subPrevNickname)) {
                return true;
            }
        }
        return false;
    }

}
