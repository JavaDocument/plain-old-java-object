package lkdcode.class2.app.domain.member;

import java.util.LinkedList;
import java.util.Queue;

public class MemberListImpl {
    private final Queue<Profile> queue;

    public MemberListImpl(Queue<Profile> queue) {
        this.queue = queue;
    }

    public Queue<Profile> get() {
        return new LinkedList<>(queue);
    }

}
