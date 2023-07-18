package lkdcode.class2.app.domain.global;

import lkdcode.class2.app.domain.member.CrewList;

public class GlobalTestData {
    protected final CrewList crewList = new CrewList(
            new String[][]{
                    {"jm@email.com", "제이엠"},
                    {"jason@email.com", "제이슨"},
                    {"woniee@email.com", "워니"},
                    {"mj@email.com", "엠제이"},
                    {"nowm@email.com", "이제엠"}
            });
}
