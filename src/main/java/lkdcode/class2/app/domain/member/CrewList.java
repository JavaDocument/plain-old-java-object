package lkdcode.class2.app.domain.member;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Function;

public final class CrewList implements Crew {
    private final Queue<Profile> crewList = new LinkedList<>();

    public CrewList(String[][] profile) {
        for (String[] crew : profile) {
            crewList.add(Profile.of(crew));
        }
    }

    @Override
    public Queue<Profile> get() {
        return new LinkedList<>(crewList);
    }

    @Override
    public List<String> getEmailList() {
        return getProperty(Profile::email);
    }

    @Override
    public List<String> getNicknameList() {
        return getProperty(Profile::nickname);
    }

    private List<String> getProperty(Function<Profile, String> profileStringFunction) {
        Queue<Profile> crewList = get();
        List<String> propertyList = new ArrayList<>();

        for (Profile profile : crewList) {
            propertyList.add(profileStringFunction.apply(profile));
        }

        return propertyList;
    }

}
