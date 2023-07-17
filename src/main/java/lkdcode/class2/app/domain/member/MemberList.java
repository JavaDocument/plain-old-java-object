package lkdcode.class2.app.domain.member;

import java.util.Collection;

public sealed interface MemberList permits MemberListImpl, MemberResultImpl {

    Collection<?> memberList();

}
