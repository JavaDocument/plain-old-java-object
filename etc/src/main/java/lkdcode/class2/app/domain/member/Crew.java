package lkdcode.class2.app.domain.member;

import java.util.*;
import java.util.stream.Collectors;

public class Crew {
    private final Map<String, String> crew = new LinkedHashMap<>();

    public Crew(final String[][] profiles) {
        int EMAIL_IDX = 0;
        int NICKNAME_IDX = 1;

        Arrays.stream(profiles)
                .forEach(profile -> crew.put(profile[NICKNAME_IDX], profile[EMAIL_IDX]));
    }

    public List<String> getNicknameList() {
        return new ArrayList<>(crew.keySet());
    }

    public List<String> getResultList(final Set<String> nicknameList) {
        return nicknameList.stream()
                .map(crew::get)
                .sorted()
                .collect(Collectors.toList());
    }

}
