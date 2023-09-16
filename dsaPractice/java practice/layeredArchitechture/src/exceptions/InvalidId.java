package exceptions;

public class InvalidId extends RuntimeException{
    public InvalidId(String msg){
        super(msg);
    }
}
