package lkdcode.class2.app.domain.member;

import java.util.List;
import java.util.Queue;

public sealed interface Crew permits CrewList {

    Queue<Profile> get();

    public List<String> getNicknameList();

    public List<String> getEmailList();

}
