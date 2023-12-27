package code.recursion.basicQuestions.Strings;

public class Stream {
    public static void main(String[] args) {
//      skip("","bacdardaf");
//        System.out.println(skip("tafcaayga"));
//        System.out.println(skipApple("ghhapplejp"));
        System.out.println(skipAppNotApple("ghhappihsdapplejp"));
    }
    //code for skipping letter 'a' with no return type
    public static void skip(String processed, String unprocessed){
        //base condition to terminate recursion call
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        //taking 1st caharacter  from unprocessed at every recursion call
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            //skip
            skip(processed,unprocessed.substring(1));
        }
        else{
            //include in processed
            skip(processed+ch,unprocessed.substring(1));
        }

    }
    //code for skipping letter 'a' with return type - String
    public static String skip(String up){
        //base condition
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            //skip
            return skip(up.substring(1));
        }
        else{
            //include
            return ch+skip(up.substring(1));
        }
    }

    //code for skipping word 'apple' with return type - String
    public static String skipApple(String up){
     if(up.isEmpty()){
         return "";
     }
     if(up.startsWith("apple")){
     //skip apple
     return skipApple(up.substring(5));
     }
     else{
    return up.charAt(0) + skipApple(up.substring(1));
     }
    }

    //code fo skipping word 'app' not 'apple' with return type - String
    public static String skipAppNotApple(String up){
         if(up.isEmpty()){
             return "";
         }
         if(up.startsWith("app") && !up.startsWith("apple")){
             return skipAppNotApple(up.substring(3));
         }
         else{
             return up.charAt(0) + skipAppNotApple(up.substring(1));
         }
    }

}
