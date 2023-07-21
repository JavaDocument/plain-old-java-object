package golddrone.class2.v2;

public class CustomException extends RuntimeException{
    public CustomException() {
    }

    CustomException(String message){
        super(message);
    }
}
