package yewon.class2.app.service;

import yewon.class2.app.handler.OutputHandler;
import yewon.class2.app.repository.Crew;
import yewon.class2.app.repository.CrewList;

import java.util.LinkedList;
import java.util.List;

public class Validator {
    private final int SUB_LENGTH = 2;
    private final DuplicateValidator duplicateValidator;
    private final EmailValidator emailValidator;
    private final NicknameValidator nicknameValidator;
    private final OutputHandler output;
    private List<String> duplicateEmailList;

    public Validator() {
        nicknameValidator = new NicknameValidator();
        emailValidator = new EmailValidator();
        duplicateValidator = new DuplicateValidator();
        output = new OutputHandler();
        this.duplicateEmailList = new LinkedList<>();
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

    public void crewListValid(String inputCrewData) {
        if (inputCrewData.length() == 0 || inputCrewData == null) {
            output.message("⚠ 크루의 정보를 제대로 입력해주세요!");
            System.exit(0);
        }
    }

    public void crewValid(String[] crew) {
        if (!emailValidator.valid(crew[0])) {
            output.message("⚠ 이메일은 11자 이상 20자 미만으로 형식에 맞게 입력해주세요!");
            System.exit(0);
        }
        if (!nicknameValidator.valid(crew[1])) {
            output.message("⚠ 닉네임은 1자 이상 20자 미만으로 한글로 입력해주세요!");
            System.exit(0);
        }
    }

    public void crewListLengthValid() {
        if (CrewList.getInstance().getCrewList().size() > 10000) {
            output.message("⚠ 크루는 10000명을 넘을 수 없습니다!");
            System.exit(0);
        }
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
