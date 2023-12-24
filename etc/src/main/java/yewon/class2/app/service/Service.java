package yewon.class2.app.service;

import yewon.class2.app.repository.Crew;
import yewon.class2.app.repository.CrewList;

import java.util.LinkedList;
import java.util.List;

public class Service {

    private final int SUB_LENGTH = 2;
    private List<String> duplicateEmailList;

    public Service(List<String> duplicateEmailList) {
        this.duplicateEmailList = duplicateEmailList;
    }

    public List<String> findDuplicateNickname() {
        List<Crew> crewList = CrewList.getInstance().getCrewList();
        for (int i = 0; i < crewList.size() - 1; i++) {
            Crew currentCrew = crewList.get(i);
            for (int j = i + 1; j < crewList.size(); j++) {
                Crew nextCrew = crewList.get(j);
                isDuplicate(currentCrew, nextCrew);
            }
        }
        return duplicateEmailList;
    }

    private void isDuplicate(Crew currentCrew, Crew nextCrew) {
        String currentNickname = currentCrew.getNickname();
        String nextNickname = nextCrew.getNickname();
        for (int i = 0; i < currentNickname.length() - SUB_LENGTH; i++) {
            String subPrevNickname = currentNickname.substring(i, i + SUB_LENGTH);
            if (nextNickname.contains(subPrevNickname)) {
                duplicateEmailList.add(currentCrew.getEmail());
                duplicateEmailList.add(nextCrew.getEmail());
            }
        }
    }
}
