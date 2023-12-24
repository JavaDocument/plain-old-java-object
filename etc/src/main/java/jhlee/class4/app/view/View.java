package jhlee.class4.app.view;

import jhlee.class4.app.dto.request.RequestDTO;
import jhlee.class4.app.dto.response.ResponseDTO;
import jhlee.class4.app.entity.Friends;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class View {
    private View() {}
    public static View newInstance() {
        return new View();
    }
    public RequestDTO showMainMenu() {
        System.out.println("프로그램 시작!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String user;
        List<Friends> friends;
        List<String> visitors;
        try {
            user = requestUser(br);
            friends = requestFriends(br);
            visitors = requestVisitors(br);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new RequestDTO(user, friends, visitors);
    }

    public void showResult(ResponseDTO dto) {
        System.out.print("[");
        for (String friend : dto.result()) {
            System.out.print("\"" + friend + "\",");
        }
        System.out.println("]");
    }

    private static String requestUser(BufferedReader br) throws IOException {
        System.out.println("사용자 명을 입력해주세요");
        return br.readLine();
    }

    private static List<Friends> requestFriends(BufferedReader br) throws IOException {
        ArrayList<Friends> friends = new ArrayList<>();
        while (true) {
            System.out.println("친구를 입력받습니다. 입력을 종료하시려면 공백을 입력해주세요");
            System.out.println("친구 1을 입력해주세요");
            String friend1 = br.readLine();
            if (friend1.isEmpty()) break;

            System.out.println("친구 2를 입력해주세요");
            String friend2 = br.readLine();
            if (friend2.isEmpty()) break;

            friends.add(new Friends(friend1, friend2));
        }
        return friends;
    }

    private static List<String> requestVisitors(BufferedReader br) throws IOException {
        ArrayList<String> visitors = new ArrayList<>();
        while (true) {
            System.out.println("방문자를 입력받습니다. 입력을 종료하시려면 공백을 입력해주세요");
            System.out.println("방문자를 입력해주세요");
            String visitor = br.readLine();
            if (visitor.isEmpty()) break;

            visitors.add(visitor);
        }
        return visitors;
    }
}
