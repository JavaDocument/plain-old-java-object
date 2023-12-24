package yewon.class2.app.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// 싱글톤 패턴
public class CrewList {

    private List<Crew> crewList;
    private List<String> emailList;
    private List<String> nicknameList;

    private static final CrewList instance = new CrewList();

    private CrewList() {
        crewList = new LinkedList<>();
        this.emailList = getEmailList(crewList);
        this.nicknameList = getNicknameList(crewList);
    }

    public static CrewList getInstance() {
        return instance;
    }

    public List<Crew> getCrewList() {
        return new LinkedList<>(crewList);
    }

    public List<String> getEmailList() {
        return emailList;
    }

    public List<String> getNicknameList() {
        return nicknameList;
    }

    public void setCrewList(Crew crew) {
        crewList.add(crew);
    }

    public List<String> getEmailList(List<Crew> crewList) {
        return this.crewList.stream()
                .map(Crew::getEmail)
                .collect(Collectors.toList());
    }

    public List<String> getNicknameList(List<Crew> crewList) {
        return this.crewList.stream()
                .map(Crew::getNickname)
                .collect(Collectors.toList());
    }
}
