package code.recursion.basicQuestions.Backtracking;

public class NQueen  {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board, 0));
    }
    static int queen(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        // placing the queen and checking for every row and col
       for(int col=0; col< board.length; col++){
           if(isSafe(board, row, col)){
               //when it is safe to place and then marking it as true
              board[row][col] = true;
              count = count + queen(board, row+1);
              //making co-ordinate available for the next path by marking it as false while backtracking
               board[row][col] = false;
           }

       }
       return count;
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        //check vertical row
      for(int i=0; i<row; i++){
          if(board[i][col] == true){
              //not safe to place Queen
              return false;
          }
      }
        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                //not safe to place Queen
                return false;
            }
        }
        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                //not safe to place Queen
                return false;
            }
        }
        //safe to place Queen
        return true;

    }
    static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean element: row){
                   if(element){
                       System.out.print("Q ");
                   }
                   else {
                       System.out.print("X ");
                   }

            }
            System.out.println();
        }
    }

}
