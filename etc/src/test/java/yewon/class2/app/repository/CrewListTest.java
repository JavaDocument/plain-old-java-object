package yewon.class2.app.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CrewListTest {

    @Test
    void setUp() {
        String crewData = "[[\"jm@email.com\", \"제이엠\"], [\"jason@email.com\", \"제이슨\"], [\"woniee@email.com\", \"워니\"], [\"mj@email.com\", \"엠제이\"], [\"nowm@email.com\", \"이제엠\"]]";
        String substrCrewData = crewData.substring(2, crewData.length() - 2);
        String[] crewDataArray = substrCrewData.split("], \\[");
        System.out.println(crewDataArray[4]);
    }

}
