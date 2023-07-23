package jhlee.class2.app.service;

import jhlee.class2.app.dto.request.CrewRegisterRequestDTO;
import jhlee.class2.app.entity.Crew;

import java.util.*;
import java.util.stream.Collectors;

public class Service {

    private static final int INT_OF_GA = '가';
    private static final int INT_OF_HIT = '힣';

    private Service() {}

    public static Service newInstance() {
        return new Service();
    }

    public List<Crew> checkValidate(Queue<CrewRegisterRequestDTO> crewRegisterRequestDTOQueue) {

        Set<String> emailDuplicateCheckSet = new HashSet<>();

        Set<String> nicknameDuplicateCheckSet = new HashSet<>();

        return crewRegisterRequestDTOQueue.stream()
                .filter(dto -> {
                    String email = dto.getEmail();
                    int emailLength = email.length();
                    if (emailLength < 11 || emailLength > 19) return false;

                    String nickname = dto.getNickname();
                    int nicknameLength = nickname.length();
                    if (nicknameLength < 1 || nicknameLength > 19) return false;

                    StringTokenizer tokenizer = new StringTokenizer(email, "@");
                    if (tokenizer.countTokens() != 2) return false;
                    String emailAccount = tokenizer.nextToken();
                    if (!tokenizer.nextToken().equals("email.com")) return false;

                    if (!emailDuplicateCheckSet.add(emailAccount)) return false;

                    Set<String> tempSet = new HashSet<>();

                    char firstCharOfNickname = nickname.charAt(0);
                    if (firstCharOfNickname < INT_OF_GA || firstCharOfNickname > INT_OF_HIT) return false;

                    for (int i = 0; i < nicknameLength - 1; i++) {
                        char secondCharOfSubString = nickname.charAt(i + 1);
                        if (secondCharOfSubString < INT_OF_GA || secondCharOfSubString > INT_OF_HIT) return false;

                        tempSet.add(nickname.substring(i, i + 1));
                    }

                    return nicknameDuplicateCheckSet.addAll(tempSet);
                })
                .sorted(Comparator.comparing(CrewRegisterRequestDTO::getEmail))
                .map(dto -> Crew.builder()
                        .email(dto.getEmail())
                        .nickname(dto.getNickname())
                        .build())
                .collect(Collectors.toList());

    }

}
