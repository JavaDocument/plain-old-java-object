package sum.class2.app;

import sum.class2.app.member.Member;

import java.util.*;

public class AppTest {

    public static List<String> findDuplicateNicknames(List<String> nicknameList) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (String name : nicknameList) {
            for (int i = 0; i < name.length() - 1; i++) {
                String twoChars = name.substring(i, i + 2);
                System.out.println(twoChars);
                countMap.put(twoChars, countMap.getOrDefault(twoChars, 0) + 1);
            }
        }


        for (String name : nicknameList) {
            boolean hasDuplicateTwoChars = false;
            for (int i = 0; i < name.length() - 1; i++) {
                String twoChars = name.substring(i, i + 2);
                if (countMap.get(twoChars) >= 2) {
                    hasDuplicateTwoChars = true;
                    break;
                }
            }
            if (hasDuplicateTwoChars) {
                result.add(name);
            }
        }

        return result;

    }


    public static void main(String[] args) {

        Set<Member> members = new HashSet<>();
        members.add(new Member("jm@email.com", "제이엠"));
        members.add(new Member("jason@email.com", "제이슨"));
        members.add(new Member("woniee@email.com", "워니"));
        members.add(new Member("mj@email.com", "엠제이"));
        members.add(new Member("nowm@email.com", "이제엠"));



        List<String> nicknameList = new ArrayList<>();
        for (Member member : members) {
            nicknameList.add(member.getNickName());
        }

        System.out.println("nicknameList = " + nicknameList);

        List<String> nicknames = findDuplicateNicknames(nicknameList);
        System.out.println(nicknames);



    }
}
