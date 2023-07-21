package golddrone.class2.v3.repository;

import golddrone.class2.v3.entity.Crew;

import java.util.List;


public interface CrewRepository {
    void save(Crew crew);
    List<Crew> findAll();


}
