package golddrone.class2.v3.repository;

import golddrone.class2.v3.entity.Crew;

import java.util.HashMap;


public interface crewRepository {
    void save(Crew crew);
    HashMap<String, Crew> findAll();


}
