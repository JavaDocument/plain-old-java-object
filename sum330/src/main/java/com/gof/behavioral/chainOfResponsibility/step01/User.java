package com.gof.behavioral.chainOfResponsibility.step01;

class User {


    private User next;

    // user0 - user1 - user2 - user3 - user4
    public static User link(User first, User... chain) {
        User head = first;//100

        for (User setNext : chain) { // user1, user2, user3, user4
            head.next = setNext;
            head = setNext;
        }

        return first;
    }


}

class C {
    public static void main(String[] args) {
        // user0 - user1 - user2 - user3 - user4
        User link = User.link(
                new User(),
                new User(),
                new User(),
                new User(),
                new User()
        );
    }
}
