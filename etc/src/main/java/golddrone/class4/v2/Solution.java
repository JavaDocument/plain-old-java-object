package golddrone.class4.v2;



import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    private UserRepository userRepository;

    public Solution(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void solution(){
        String user = "mrko";

        String[][] frineds = {
                {"donut", "andole"},
                {"donut", "jun"},
                {"donut", "mrko"},
                {"shakevan", "andole"},
                {"shakevan", "jun"},
                {"shakevan", "mrko"}
        };

        String[] visitor = {
                "bedi",
                "bedi",
                "donut",
                "bedi",
                "shakevan"
        };

        HashMap<String, Integer> result = new HashMap<>();


        // 유저 레포지토리 초기화 작업
        for (int i = 0; i < frineds.length; i++) {
            for (int j = 0; j < frineds[i].length; j++) {
                 userRepository.UserSaved(new User(frineds[i][j]));
            }
        }

        for (int i = 0; i < visitor.length; i++) {
            userRepository.UserSaved(new User(visitor[i]));
        }


//        6명이 잘 들어갔는지 확인하는 코드
//        List<User> test = userRepository.findAll();
//        for (User user1 : test) {
//            System.out.println(user1.getName());
//        }


        // 친구 추가 작업
        for (int i = 0; i < frineds.length; i++) {
            User user1 = userRepository.findUser(frineds[i][0]);
            User user2 = userRepository.findUser(frineds[i][1]);
            Map<String, Integer> user1Friends = user1.getFriends();
            Map<String, Integer> user2Friends = user2.getFriends();
            if(!user1Friends.containsKey(String.valueOf(user2.getName()))){
                user1Friends.put(user2.getName(), 0);
                user1.setFriends(user1Friends);
            }
            if(!user2Friends.containsKey(String.valueOf(user1.getName()))){
                user2Friends.put(user1.getName(), 0);
                user2.setFriends(user2Friends);
            }
        }


//      친구가 잘 들어갔는지 확인하는 코드
//        List<User> test = userRepository.findAll();
//        for (User temp : test) {
//            System.out.println(temp.getName() +"님의 친구목록 : " + temp.getFriends());
//        }

        // 친구 추가 작업 끝

        // 추천 친구를 담아주는 코드
        List<User> users = userRepository.findAll();
        User target = userRepository.findUser(user);
        Map<String, Integer> friends = target.getFriends();
        for (String s : friends.keySet()) {
            User s1 = userRepository.findUser(s);
            Map<String, Integer> friends1 = s1.getFriends();
            for (String string : friends1.keySet()) {
                if(!friends.containsKey(String.valueOf(string)) && !string.equals(target.getName())){
                    result.put(string, result.getOrDefault(string, 0) + 10);
                }
            }
        }

        for (String s : visitor) {
            if(!friends.containsKey(String.valueOf(s)) && !s.equals(target.getName())){
                result.put(s, result.getOrDefault(s, 0) + 1);
            }
        }

        // 추천 점수가 가장 높은 순으로 정렬, 추천점수가 같은 경우는 이름순, 최대 5명

        List<String> resultSet = new ArrayList<>(result.keySet());

        resultSet.sort((o1, o2) -> {
                    int i = result.get(o2).compareTo(result.get(o1));
                    if(i==0) return o1.compareTo(o2);
                    return i;
                }
        );

        int cnt = 0;
        // 결과를 출력하는 코드
        for (String name : resultSet) {
            if(cnt>=5) break;
            System.out.println(result.get(name) + " " + name);
            cnt++;
        }


    }

}
