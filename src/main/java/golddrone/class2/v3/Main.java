package golddrone.class2.v3;

import golddrone.class2.v3.entity.Crew;
import golddrone.class2.v3.repository.CrewRepository;
import golddrone.class2.v3.repository.CrewRepositoryImpl;
import golddrone.class2.v3.service.CrewService;
import golddrone.class2.v3.view.CrewView;

import java.util.*;

public class Main {

    public static void main(String[] args){
        CrewRepository crewRepository = new CrewRepositoryImpl();
        CrewView crewView = new CrewView();
        Scanner scanner = new Scanner(System.in);
        CrewService crewService = new CrewService(crewRepository);

        while (true){
            Crew crew = crewView.inputCrew();
            crewService.saveCrew(crew);
            System.out.println("계속 저장하시겠습니까? y/Y");
            if(!(scanner.next().toLowerCase().charAt(0) == 'y')){
                break;
            }
        }

        List<Crew> crewList = crewService.findAll();
        List<String> emailList = crewService.process(crewList);
        Collections.sort(emailList);

        for (String email : emailList) {
            System.out.println(email);
        }



    }

}
