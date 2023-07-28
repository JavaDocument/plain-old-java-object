package lkdcode.class4.app.domain.entity;

import lkdcode.class4.app.domain.user.Member;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class UserResult {
    private final PriorityQueue<Member> list;

    private UserResult() {
        this.list = new PriorityQueue<>(
                Comparator.comparingInt(Member::getRecommendedScore)
                        .thenComparing(Member::getName));
    }

    public static UserResult getInstance() {
        return new UserResult();
    }

    public void addUser(Member member) {
        list.add(member);
    }

    public List<String> getList() {
        return copyList();
    }

    private List<String> copyList() {
        List<String> copyList = list.stream()
                .map(Member::getName)
                .toList();
        return new ArrayList<>(copyList);
    }

}
