package golddrone.class2.v3.repository;

import golddrone.class2.v3.entity.Crew;

import java.util.ArrayList;
import java.util.List;

public class CrewRepositoryImpl implements CrewRepository {

    private static final List<Crew> crewList = new ArrayList<>();

    @Override
    public void save(Crew crew) {
        crewList.add(crew);
    }

    @Override
    public List<Crew> findAll() {
        return crewList;
    }
}
