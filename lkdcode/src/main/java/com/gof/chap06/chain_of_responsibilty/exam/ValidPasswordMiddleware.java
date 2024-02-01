package com.gof.chap06.chain_of_responsibilty.exam;

abstract class ValidPasswordMiddleware {
    private ValidPasswordMiddleware next;

    public static ValidPasswordMiddleware chainOf(
            ValidPasswordMiddleware first,
            ValidPasswordMiddleware... link
    ) {
        ValidPasswordMiddleware head = first; // 100
        // head == first;
        // first.next == null
        // first.next == ???

        // head.next = null || ???
        for (ValidPasswordMiddleware nextLink : link) {
            // 200,300,400,500
            head.next = nextLink;
            //  first.next == nextLink // 200
            head = nextLink;
            // head == first.next; // 200
        }

        return first;
    }

    protected boolean nextValid(String password) {
        if (next != null) return next.valid(password);
        return true;
    }

    abstract boolean valid(String password);
}

class Mango extends ValidPasswordMiddleware {

    @Override
    boolean valid(String password) {
        // 'A' 로 시작해?
        if (!(password.startsWith("A") || password.startsWith("a"))) {
            System.out.println("'A'로 시작하지 않는다.");
            return false;
        }

        return super.nextValid(password);
    }
}

class Guava extends ValidPasswordMiddleware {

    @Override
    boolean valid(String password) {
        if (password.length() < 5) {
            System.out.println("비밀번호가 5자 미만이다.");
            return false;
        }

        return super.nextValid(password);
    }
}