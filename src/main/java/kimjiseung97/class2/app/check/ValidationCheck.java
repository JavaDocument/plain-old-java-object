package kimjiseung97.class2.app.check;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidationCheck {

    //한글만 걸러내기 정규표현식
    private final String filterKorean = "^[가-힣]*$";

    //이메일 양식 정규 표현식
    private final String emailPattern = "^[\\w-+]+@email\\.com$";

    //크루 최대 가입 제한인워
    private static final int maxLength = 10000;
    //크루 최소 가입인원
    private static final int minLength = 1;

    //이메일 최대 길이 제한
    private static final int emailMaxLength = 20;

    //이메일 최소 길이제한
    private static final int emailMinLength = 11;

    //닉네임 최대길이
    private static final int nickNameMaxLength = 20;
    //닉네임 최소길이
    private static final int nickNameMinLength = 11;


    private static String[][] memberList;


    public void check(final String[][] list) {
        memberList = list;

//        Arrays.stream(MemberList).forEach(profile -> {
//            String email = profile[0];
//            String nickname = profile[1];
//            System.out.println("이메일: " + email + ", 닉네임: " + nickname);
//        });
        validationEmailPattern();
        validationEmailSize();
        validationnickname();
        validationnicknameSize();
    }

    private void validationMaxCrewsize() {
        if (memberList.length > maxLength) {
            throw new RuntimeException("최대 인원을 초과했습니다! " + memberList.length);
        }
    }

    private void validationMinCrewSize() {
        if (memberList.length < minLength) {
            throw new RuntimeException("크루인원은 최소 한명 이상이어야합니다 " + memberList.length);
        }
    }

    private void validationEmailPattern() {
        List<String> invalidEmails = Arrays.stream(memberList)
                .map(profile -> profile[0])  // 이메일 추출
                .filter(email -> !email.matches(emailPattern))  // 유효하지 않은 이메일 필터링
                .collect(Collectors.toList());  // 필터링된 이메일을 리스트로 변환

        if (!invalidEmails.isEmpty()) {  // 유효하지 않은 이메일이 있는 경우
            System.out.println("유효하지 않은 이메일 양식:");
            invalidEmails.forEach(System.out::println);  // 유효하지 않은 이메일 출력
        }
    }

    private void validationnickname(){
        List<String> invalidnickNames = Arrays.stream(memberList)
                .map(profile -> profile[1])  // 닉네임 추출
                .filter(nickname -> !nickname.matches(filterKorean))  // 한글이아닌 닉네임 필터링
                .collect(Collectors.toList());  // 필터링된 닉네임을 리스트로 변환

        if (!invalidnickNames.isEmpty()) {  // 유효하지 않은 이메일이 있는 경우
            System.out.println("이름은 한글이어야 합니다:");
            invalidnickNames.forEach(System.out::println);  // 유효하지 않은 이메일 출력
        }
    }


    private void validationEmailSize() {
        List<String> invalidEmailLengths = Arrays.stream(memberList)
                .map(profile -> profile[0]) // 이메일 추출
                .filter(email -> email.length() > emailMaxLength && email.length() < emailMinLength) // 길이를 기반으로 유효하지 않은 이메일 필터링
                .collect(Collectors.toList()); // 필터링된 이메일을 리스트로 변환

        if (!invalidEmailLengths.isEmpty()) { // 유효하지 않은 이메일 길이가 있는 경우
            System.out.println("이메일 길이가 최소 11자 이상, 20자 미만이어야 합니다:");
            invalidEmailLengths.forEach(System.out::println); // 유효하지 않은 이메일 길이 출력
        }
    }

    private void validationnicknameSize() {
        List<String> invalidnicknameLengths = Arrays.stream(memberList)
                .map(profile -> profile[1]) // 이메일 추출
                .filter(nickname -> nickname.length() < nickNameMaxLength && nickname.length() >= nickNameMinLength) // 길이를 기반으로 유효하지 않은 이메일 필터링
                .collect(Collectors.toList()); // 필터링된 이메일을 리스트로 변환

        if (!invalidnicknameLengths.isEmpty()) { // 유효하지 않은 이메일 길이가 있는 경우
            System.out.println("닉네임 길이가 최소 1자 이상, 20자 미만이어야 합니다:");
            invalidnicknameLengths.forEach(System.out::println); // 유효하지 않은 이메일 길이 출력
        }
    }









}
