package exceptions;

public class InvalidSalary extends RuntimeException{
    public InvalidSalary(String msg){
        super(msg);
    }
}
