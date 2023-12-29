package code.recursion.basicQuestions.Backtracking;

import java.util.Arrays;

//introduction to backtracking
public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        //        allPath("", board, 0,0);

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0,0, path, 1);
    }
    static void allPath(String p,boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        // i am considering this block in my path
        maze[r][c] = false;
        if(r>0) {
            //for Upward path
            allPath(p + 'U',maze,r - 1, c);
        }
        if(c>0) {
            //for left path
            allPath(p + 'L',maze,r, c - 1);
        }
        if(r<maze.length-1) {
            //for downward path
            allPath(p + 'D',maze,r + 1, c);
        }
        if(c<maze[0].length-1) {
            //for right path
            allPath(p + 'R',maze, r, c + 1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }
    static void allPathPrint(String p,boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if(r>0) {
            //for Upward path
            allPathPrint(p + 'U',maze,r - 1, c, path, step+1);
        }
        if(c>0) {
            //for left path
            allPathPrint(p + 'L',maze,r, c - 1, path, step+1);
        }
        if(r<maze.length-1) {
            //for downward path
            allPathPrint(p + 'D',maze,r + 1, c, path, step+1);
        }
        if(c<maze[0].length-1) {
            //for right path
            allPathPrint(p + 'R',maze, r, c + 1, path, step+1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
