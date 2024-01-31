package com.gof;

import java.util.List;

class User {
    private User next; // user0 - user1 - user2 - user3 - user4
                       //
 List<User> list; // list.get(0) - list.get(1) - list.get(2)
    // private String name;

    public void appendUser(User user1) {
        this.next = user1;
    }

    // class user1
//    public void next(User user2) {
//        this.next = user2;
//    }
}
