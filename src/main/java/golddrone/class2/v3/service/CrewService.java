package golddrone.class2.v3.service;

import golddrone.class2.v3.common.CustomException;
import golddrone.class2.v3.common.Validate;
import golddrone.class2.v3.entity.Crew;
import golddrone.class2.v3.repository.CrewRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static golddrone.class2.v3.common.Validate.*;

public class CrewService {
    private final CrewRepository crewRepository;
    public CrewService(CrewRepository crewRepository) {
        this.crewRepository = crewRepository;
    }

    public List<Crew> findAll(){
        return crewRepository.findAll();
    }

    public boolean saveCrew(Crew crew){
        crewRepository.save(crew);
        return true;
    }

    public List<String> process(List<Crew> crewList) throws CustomException {
        crewValidate(crewList);
        List<String> list = new ArrayList<>();
        process(crewList, list);
        return list;
    }

    private static void process(List<Crew> crewList, List<String> list) {
        crewList.forEach((crew) -> {
            duplicateProcess(crewList, list, crew.getEmail(), crew.getNickname());
        });
    }

    private static void duplicateProcess(List<Crew> crewList, List<String> list, String email, String nickname) {
        outer:
        for (int i = 2; i <= nickname.length(); i++) {
            for (int j = 0; j < nickname.length() - i +1  ; j++) {
                String validateNickname = nickname.substring(j, j + i);
                int duplicateCount = 0;
                for (Crew crew : crewList) {
                    String email2 = crew.getEmail();
                    String nickname2 = crew.getNickname();
                    if (nickname2.contains(validateNickname)) {
                        duplicateCount++;
                    }
                    if (duplicateCount > 1) {
                        list.add(email);
                        break outer;
                    }
                }
            }
        }
    }

}
