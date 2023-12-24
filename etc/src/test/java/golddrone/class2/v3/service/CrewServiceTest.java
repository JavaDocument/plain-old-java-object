package golddrone.class2.v3.service;

import golddrone.class2.v3.entity.Crew;
import golddrone.class2.v3.repository.CrewRepository;
import golddrone.class2.v3.repository.CrewRepositoryImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrewServiceTest {
    private final CrewRepository crewRepository = new CrewRepositoryImpl();
    private final CrewService crewService = new CrewService(crewRepository);


    @Test
    void process() {
        

    }
}