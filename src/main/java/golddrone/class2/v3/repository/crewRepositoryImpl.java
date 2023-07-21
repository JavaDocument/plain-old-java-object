package golddrone.class2.v3.repository;

import golddrone.class2.v3.entity.Crew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class crewRepositoryImpl implements crewRepository{

    private static final List<Crew> crews = new ArrayList<>();
    
    @Override
    public void save(Crew crew) {

    }

    @Override
    public HashMap<String, Crew> findAll() {
        return null;
    }
}
