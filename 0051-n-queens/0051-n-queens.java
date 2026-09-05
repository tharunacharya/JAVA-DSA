class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][]= new char[n][n];
        //fill with .
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }
        List<List<String>> res = new ArrayList<>();
        solu(0,res,board);
        return res;
    }
    private void solu(int col, List<List<String>> res, char board[][]){
        int n= board.length;
        if(col==n){
            containsboard(board,res);
            return;
        }

        for(int row=0;row<n;row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                solu(col+1, res, board);
                board[row][col] = '.';
            }
        }
        }
        private boolean isSafe(char board[][], int row, int col){
            int n =board.length;
            for(int k=1;k<board.length;k++){
                int c = col-k;
                if(c<0) break;

                int r=row-k;
                if(r>=0){
                    if(board[r][c]=='Q') return false;
                }
                 r=row+k;
                if(r<n){
                    if(board[r][c]=='Q') return false;
                }

                if(board[row][c]=='Q') return false;
            }

            return true;
        }
    private void containsboard(char board[][], List<List<String>> res){
        List<String> current = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row = new String(board[i]);
            current.add(row);
        }
        res.add(current);
}
}