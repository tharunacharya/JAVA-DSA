class Solution {
    public void solveSudoku(char[][] board) {
        sudo(board,0,0);
    }
    public boolean sudo(char[][] board, int row , int col){
        if(col==9){
            col=0;
            row=row+1;
        }
        if(row==9){
            return true;
        }

        if(board[row][col]!='.'){
            return sudo(board,row,col+1);
        }
        for(int d=1;d<=9;d++){
            char digit=(char)(d+'0');
            if(isPlace(digit,board,row,col)){
                board[row][col]=digit;
                if(sudo(board,row,col+1)){
                    return true;
                }
                board[row][col]='.';
            }
            
        }
        return false;
    }
    public boolean isPlace(char digit,char[][] board, int row, int col){
        for(int j=0;j<9;j++){
            //current row
            if(board[row][j]==digit) return false;
            //current column
            if(board[j][col]==digit) return false;
            // for finding grid
            int r=3*(row/3)+(j/3);
            int c=3*(col/3)+(j%3);
            if(board[r][c]==digit) return false;
        }
        return true;
    }
}