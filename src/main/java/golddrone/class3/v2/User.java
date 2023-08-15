package golddrone.class3.v2;

public record User(String name, int leftPage, int rightPage) {
    public User {
        if(leftPage < 1 || leftPage > 400){
            throw new IllegalArgumentException("leftPage cantnot be negative");
        }

        if(rightPage < 1 || rightPage > 400){
            throw new IllegalArgumentException("rightPage cantnot be negative");
        }
    }
}

