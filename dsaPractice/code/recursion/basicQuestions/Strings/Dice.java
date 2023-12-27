package code.recursion.basicQuestions.Strings;

import java.util.ArrayList;

//amazon question ***********
public class Dice {
    public static void main(String[] args) {
//        dice("", 4);
//        System.out.println(diceRet("", 4));
//        diceFace("", 4,8);
        System.out.println(diceFaceRet("", 4, 8));
    }
    //return type void
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=6 && i<=target; i++){
            dice(p+i,target-i);
        }
    }
    //return type arraylist
    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<=6 && i<=target; i++){
            list.addAll(diceRet(p+i,target-i));
        }
        return list;
    }
    //when dice face is not 6, for example when dice face can be 7 or 8 anything
    //void return type
    static void diceFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=face && i<=target; i++){
            diceFace(p+i,target-i, face);
        }
    }
    //when dice face is not 6, for example when dice face can be 7 or 8 anything
    //ArrayList return type
    static ArrayList<String> diceFaceRet(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<=face && i<=target; i++){
            list.addAll(diceFaceRet(p+i,target-i, face));
        }
        return list;
    }
}
