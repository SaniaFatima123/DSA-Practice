package code.recursion.basicQuestions.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        mazePath("", 3, 3);
//        System.out.println(mazePathRet("",3,3));
//        System.out.println(mazePathDiagRet("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        pathObstacle("", board, 0,0);
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }
    static void mazePath(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1) {
            mazePath(p + 'D',r - 1, c);
        }
        if(c>1) {
           mazePath(p + 'R',r, c - 1);
        }
    }
    static ArrayList<String> mazePathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1) {
           list.addAll(mazePathRet(p + 'D',r - 1, c));
        }
        if(c>1) {
            list.addAll(mazePathRet(p + 'R',r, c - 1));

        }
        return list;
    }
    //including diagonal path
    static ArrayList<String> mazePathDiagRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            //recursion call for diagonal, lets represent diagonal path as 'I'
            list.addAll(mazePathDiagRet(p + 'I', r-1, c-1));
        }
        if(r>1){
            //lets represent down path as 'D'
            list.addAll(mazePathDiagRet(p + 'D', r-1, c));
        }
        if(c>1){
//            lets represent right path as 'R'
            list.addAll(mazePathDiagRet(p + 'R', r, c-1));
        }
        return list;
    }
    static void pathObstacle(String p,boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        if(r<maze.length-1){
            pathObstacle(p + 'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            pathObstacle(p + 'R', maze, r, c+1);
        }
    }

}
