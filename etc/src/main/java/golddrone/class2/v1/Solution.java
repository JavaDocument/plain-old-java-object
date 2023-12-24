package golddrone.class2.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<String> emailValidate(Map<String, String> crewList) throws CustomException {

        if (!(1 <= crewList.size() && crewList.size() <= 10000)) {
            throw new CustomException("크루 인원수는 1명 이상 10000명 이하에요");
        }

        List<String> list = new ArrayList<>();

        crewList.forEach((email, nickname) -> {

            int emailLength = email.length();
            if (!(11 <= emailLength && emailLength <= 20)) {
                throw new CustomException("이메일 길이는 11~20개의 길이에요");
            }

            if (!(email.substring(email.indexOf("@")+1).equals("email.com"))) {
                throw new CustomException("도메인의 이름은 email.com 입니다");
            }
            int nicknameLength = email.substring(0, email.indexOf("@")).length();

            if (!(1 <= nicknameLength && nicknameLength < 20)) {
                throw new CustomException("닉네임의 길이는 1~19자 입니다");
            }

//            System.out.println(nickname + "-------------");

            // 이메일 중복 검증
            outer:
            for (int i = 2; i <= nickname.length(); i++) {  // 제이, 이에    제이엠

                for (int j = 0; j < nickname.length() - i +1  ; j++) {

                    String validateNickname = nickname.substring(j, j + i);
//                    System.out.println(validateNickname);
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


        });


        return list;

    }

}
