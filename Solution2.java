import java.util.*;

public class Solution2{
   
   
    public boolean isSafe(char[][] board , int row , int col,int number){
        for(int i = 0; i < board.length; i++){
            // Row check
            if (board[row][i] == (char) (number + '0')){
                return false;
            }
            // Column check
            if (board[i][col] == (char) (number + '0')){
                return false;
            }
        }


        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

            for(int i=sr ; i < sr + 3 ; i++){

                for(int j = sc ; j < sc + 3 ; j++){
                    if (board[i][j] == (char) (number + '0')){
                    return false;
                  } 
                }
            }
            return true;
    }

    public boolean helper(char[][] board,int row ,int col){
        if(row == board.length){
            return true;
        }
        int nrow ,ncol;
        if(col != board.length - 1){

            nrow=row;
            ncol=col + 1;

        } else {

            nrow=row + 1;
            ncol=0;
        }
        if(board[row][col] != '.'){

          return helper(board,nrow,ncol);

        }else{
            for(int i =1; i<=9 ; i++){
                  if(isSafe(board,row,col,i)){
                    board[row][col]=(char)(i + '0');
                    if(helper( board, nrow, ncol)){
                          return true ;
                       }
                       board[row][col] = '.'; // Backtrack
                    }
            }
        }
        return false;

    }
    

    public void solverk(char[][] board){
        helper(board, 0, 0);
    }

   public static void printBoard(char[][] board){
        for(char[] row : board) {
            for(char num :row) {

                System.out.print(num + " ");
            }
           
            System.out.println();
        }
       
    }



    public static void main(String[] args[]){

        System.out.println("Sudoo");

        char[][] board = {

            {'1','.','.','4','8','9','.','.','6'},
            {'7','3','.','.','.','.','.','4','.'},
            {'.','.','.','.','.','1','2','9','5'},
            {'.','.','1','.','.','.','.','.','.'},
            {'9','.','.','.','.','.','.','.','.'},
            {'.','.','4','.','.','.','.','.','.'},
            {'.','.','.','.','5','.','7','8','.'},
            {'.','8','3','7','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','1','.'}
        };

        Solution2 solve = new Solution2();

        solve.solverk(board);
        System.out.println("Board");

        printBoard(board);
    }
}