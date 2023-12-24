package golddrone.class2.v3.common;

public class CustomException extends RuntimeException{
    public CustomException() {
    }

    CustomException(String message){
        super(message);
    }
}
