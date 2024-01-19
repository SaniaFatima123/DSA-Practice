import java.util.ArrayList;
import java.util.List;

// lambda expressions in Java can only be used with functional interfaces.
// A functional interface is an interface with a single abstract method (SAM).
// The purpose of lambda expressions is to provide a concise way to express instances of single-method interfaces.
//        If an interface has more than one abstract method, attempting to use a lambda expression
//        for that interface will result in a compilation error.
//        This is because lambda expressions can only be used for functional interfaces to avoid ambiguity.
@FunctionalInterface
interface NoParam{
     String noParam();
}
@FunctionalInterface
interface Person{
    String say(String message);
}
@FunctionalInterface
 interface Addition{
     int add(int a, int b);
}
public class LambdaExpression{
    public static void main(String[] args) {

        //without any parameter
        NoParam noParam = ()->{ return "No parameters";};

        //with  parameters
        Addition addition = (a,b) ->  a+b ;

        //forEach loop using lambda exp
        List<String> names = new ArrayList<String>();
        names.add("Sania");
        names.add("John");
        names.add("Sanjana");
        names.add("Asiya");

        names.forEach(
                (name)->{
                    System.out.println(name);
                }
        );

        //with multiple statements
        Person person = (message)->{
            String st1 = "I would like to say ";
            String s2 = st1 + message;
            return s2;
        };

        System.out.println(addition.add(2,3));
        System.out.println(noParam.noParam());
        System.out.println(person.say("NEVER GIVE UP"));

    }

}
