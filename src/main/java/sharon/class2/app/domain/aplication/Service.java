package sharon.class2.app.domain.aplication;


import java.util.ArrayList;
import java.util.List;

import static sharon.class2.app.domain.aplication.Controller.getNickname;

public class Service {
    public static void inputResult(String[][] employees, String newNickname) {
        String[][] result = checkIfNicknameAlike(newNickname, employees);
        if (result != null) {
            for (String[] strings : result) {
                System.out.print(strings[0] + "\n");
            }
            getNickname();
        }
    }

    public static String[][] checkIfNicknameAlike(String newNickname, String[][] employees) {

        List<String[]> matchedEmployees = new ArrayList<>();

        for (String[] employee : employees) {
            String rawNickname = employee[1];
            if (hasTwoContinuousLetters(newNickname, rawNickname)) {
                matchedEmployees.add(employee);
            }
        }
        return foundMatchedEmployees(matchedEmployees);
    }

    private static String[][] foundMatchedEmployees(List<String[]> matchedEmployees) {
        if (matchedEmployees.size() > 0) {
            return matchedEmployees.toArray(new String[0][]);
        }
        return null;
    }

    public static boolean hasTwoContinuousLetters(String newNickname, String rawNickname) {
        for (int i = 0; i < newNickname.length() - 1; i++) {
            for (int j = i + 2; j <= newNickname.length(); j++) {
                String newLetter = newNickname.substring(i, j);
                if (rawNickname.contains(newLetter)) {
                    return true;
                }
            }
        }
        return false;
    }

}
