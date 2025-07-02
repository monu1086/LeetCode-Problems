class Solution {
    public List<String> constructString(char board[][]){
        List<String> sol= new ArrayList<>();
        for(int i=0; i<board.length; i++){
            sol.add(new String(board[i]));
        }
        return sol;
    }
    public void backtrack(List<List<String>> solutions, char[][] board, int row){
        if(row==board.length){
            solutions.add(constructString(board));
            return;
        }

        for(int col=0; col<board.length; col++){
            if (isValid(board, row, col)){
                board[row][col]='Q';
                backtrack(solutions,board,row+1);
                board[row][col]='.';
            }
        }
    }
    public boolean isValid(char[][] board, int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1 , j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1 , j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board= new char[n][n];
        List<List<String>> solutions= new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }

        backtrack(solutions, board, 0);
        return solutions;
    }
}