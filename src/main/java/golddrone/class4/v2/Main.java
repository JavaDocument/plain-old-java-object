package golddrone.class4.v2;

public class Main {
    public static void main(String[] args) {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        new Solution(userRepository).solution();
    }
}
