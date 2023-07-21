package golddrone.class2.v3.common;

import golddrone.class2.v3.entity.Crew;

import java.util.List;
import java.util.Map;

public class Validate {

    public static boolean crewValidate(List<Crew> crewList) {
        if (!(1 <= crewList.size() && crewList.size() <= 10000)) {
            throw new CustomException("크루 인원수는 1명 이상 10000명 이하에요");
        }
        return true;
    }

    public static boolean nickNameValidate(String nickname) {
        int nicknameLength = nickname.length();


        if (!(1 <= nicknameLength && nicknameLength < 20)) {
            throw new CustomException("닉네임의 길이는 1~19자 입니다");
        }
        return true;
    }

    public static boolean domainNameValidate(String email) {
        if (!(email.substring(email.indexOf("@")+1).equals("email.com"))) {
            throw new CustomException("도메인의 이름은 email.com 입니다");
        }
        return true;
    }

    public static boolean emailValidate(String email) {
        int emailLength = email.length();
        if (!(11 <= emailLength && emailLength <= 20)) {
            throw new CustomException("이메일 길이는 11~20개의 길이에요");
        }
        return true;
    }
}
