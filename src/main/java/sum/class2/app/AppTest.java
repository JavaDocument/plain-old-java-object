package sum.class2.app;

import sum.class2.app.member.Member;

import java.util.*;

public class AppTest {

    public static List<String> findDuplicateNicknames(List<String> nicknameList) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, String> nicknameEmailMap = new HashMap<>();

        for (String nickname : nicknameList) {
            for (int i = 0; i < nickname.length() - 1; i++) {
                String twoChars = nickname.substring(i, i + 2);
                countMap.put(twoChars, countMap.getOrDefault(twoChars, 0) + 1);
            }
        }

        for (Member member : getMembers()) {

            String nickname = member.getNickName();
            String email = member.getEmail();

            boolean hasDuplicateTwoChars = false;
            for (int i = 0; i < nickname.length() - 1; i++) {
                String twoChars = nickname.substring(i, i + 2);
                if (countMap.get(twoChars) >= 2) {
                    hasDuplicateTwoChars = true;
                    break;
                }
            }
            if (hasDuplicateTwoChars) {
                result.add(nickname);
                nicknameEmailMap.put(nickname, email);
            }
        }

        for (String nickname : result) {
            System.out.println(nicknameEmailMap.get(nickname));
        }
        return result;
    }

    public static Set<Member> getMembers() {
        Set<Member> members = new HashSet<>();
        members.add(new Member("jm@email.com", "제이엠"));
        members.add(new Member("jason@email.com", "제이슨"));
        members.add(new Member("woniee@email.com", "워니"));
        members.add(new Member("mj@email.com", "엠제이"));
        members.add(new Member("nowm@email.com", "이제엠"));
        return members;
    }


    public static void main(String[] args) {

        List<String> nicknameList = new ArrayList<>();
        for (Member member : getMembers()) {
            nicknameList.add(member.getNickName());
        }
        List<String> nicknames = findDuplicateNicknames(nicknameList);


    }
}
