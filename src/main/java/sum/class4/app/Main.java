package sum.class4.app;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // user
        String user = "mrko";
        // user와 서로 친구
        Map<String, Integer> 서로친구 = new HashMap<>();
        // user의 타임라인 방문친구
        Map<String, Integer> 방문친구 = new HashMap<>();
        // user의 추천 친구
        Map<String, Integer> 추천친구 = new HashMap<>();


        // 친구정보
        List<List<String>> friends = new ArrayList<>();
        friends.add(List.of("donut", "andole"));
        friends.add(List.of("donut", "jun"));
        friends.add(List.of("donut", "mrko"));
        friends.add(List.of("shakevan", "andole"));
        friends.add(List.of("shakevan", "jun"));
        friends.add(List.of("shakevan", "mrko"));
        System.out.println(friends);

        // user와 친구인지 확인하기
        for (List<String> friend : friends) {
            if (friend.contains(user)) {
                String friendName = friend.get(0).equals(user) ? friend.get(1) : friend.get(0);
                서로친구.put(friendName, 서로친구.getOrDefault(friendName, 0) + 10);
            }
        }
        System.out.println("서로친구 = " + 서로친구);


        // 타임라인 방문 기록
        List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");
        for (String visitor : visitors) {
            방문친구.put(visitor, 방문친구.getOrDefault(visitor, 0) + 1);
        }
        System.out.println("방문친구 = " + 방문친구);


        // 서로친구 + 방문친구 = 추천친구
        for (Map.Entry<String, Integer> entry : 방문친구.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue() + 서로친구.getOrDefault(name, 0);
            추천친구.put(name, score);
        }

        System.out.println("추천친구 = " + 추천친구);


    }
}
