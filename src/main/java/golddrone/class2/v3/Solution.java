package golddrone.class2.v3;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<String> process(Map<String, String> crewList) throws golddrone.class2.v1.CustomException {
        crewValidate(crewList);
        List<String> list = new ArrayList<>();
        duplicateValidate(crewList, list);
        return list;
    }

    private static void duplicateValidate(Map<String, String> crewList, List<String> list) {
        crewList.forEach((email, nickname) -> {
            emailValidate(email);
            domainNameValidate(email);
            nickNameValidate(email);
            duplicateProcess(crewList, list, email, nickname);
        });
    }

    private static void duplicateProcess(Map<String, String> crewList, List<String> list, String email, String nickname) {
        outer:
        for (int i = 2; i <= nickname.length(); i++) {
            for (int j = 0; j < nickname.length() - i +1  ; j++) {
                String validateNickname = nickname.substring(j, j + i);
                int duplicateCount = 0;
                for (Map.Entry<String, String> entry : crewList.entrySet()) {
                    String email2 = entry.getKey();
                    String nickname2 = entry.getValue();
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

    private static void crewValidate(Map<String, String> crewList) {
        if (!(1 <= crewList.size() && crewList.size() <= 10000)) {
            throw new CustomException("크루 인원수는 1명 이상 10000명 이하에요");
        }
    }

    private static void nickNameValidate(String email) {
        int nicknameLength = email.substring(0, email.indexOf("@")).length();

        if (!(1 <= nicknameLength && nicknameLength < 20)) {
            throw new CustomException("닉네임의 길이는 1~19자 입니다");
        }
    }

    private static void domainNameValidate(String email) {
        if (!(email.substring(email.indexOf("@")+1).equals("email.com"))) {
            throw new CustomException("도메인의 이름은 email.com 입니다");
        }
    }

    private static void emailValidate(String email) {
        int emailLength = email.length();
        if (!(11 <= emailLength && emailLength <= 20)) {
            throw new CustomException("이메일 길이는 11~20개의 길이에요");
        }
    }

}
