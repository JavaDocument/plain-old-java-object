package golddrone.class2.v1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String, String> crewList = new HashMap<>();
        Solution solution = new Solution();
        crewList.put("jm@email.com", "제이엠");
        crewList.put("jason@email.com", "제이슨");
        crewList.put("woniee@email.com", "워니");
        crewList.put("mj@email.com", "엠제이");
        crewList.put("nowm@email.com", "이제엠");


        List<String> list = solution.emailValidate(crewList);

        Collections.sort(list);

        for (String email : list) {
            System.out.println(email);
        }



    }

}
