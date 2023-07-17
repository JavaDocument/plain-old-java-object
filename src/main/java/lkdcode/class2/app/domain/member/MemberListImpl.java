package lkdcode.class2.app.domain.member;


import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public final class MemberListImpl implements MemberList {
    private final Queue<Profile> memberList;

    public MemberListImpl(String[][] memberList) {
        this.memberList = new LinkedList<>();

        Profile profile = new Profile(memberList[0][0], memberList[0][1]);
        this.memberList.add(profile);
    }

    @Override
    public Collection<Profile> memberList() {
        // 멤버를 담았어.
        // 그거 리턴

        return memberList;
    }
}
