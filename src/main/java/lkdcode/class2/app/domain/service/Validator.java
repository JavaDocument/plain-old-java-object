package lkdcode.class2.app.domain.service;

import lkdcode.class2.app.domain.member.Profile;

import java.util.List;
import java.util.Queue;

public sealed interface Validator permits ValidatorImpl {
    //이메일은 이메일 형식에 부합하며, 전체 길이는 11자 이상 20자 미만이다.
    //신청할 수 있는 이메일은 email.com 도메인으로만 제한한다.
    boolean checkEmail(List<String> emailList);

    boolean checkEmailSize(List<String> emailList);

    //닉네임은 한글만 가능하고 전체 길이는 1자 이상 20자 미만이다.
    boolean checkNickname(List<String> nicknameList);

    //크루는 1명 이상 10,000명 이하이다.
    boolean checkSize(Queue<Profile> crewList);
}
