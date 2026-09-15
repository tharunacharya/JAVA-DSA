class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(board[r][c]==word.charAt(0)){
                    boolean found=dfs(board,r,c,word,0);
                    if(found){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
    private boolean dfs(char[][] board,int r, int c, String word, int wordIndex){
        //base case
        if(wordIndex==word.length()){
            return true;
        }

        //out of bound
        int rows=board.length;
        int col=board[0].length;
        if(r<0||c<0||r>=rows||c>=col){
            return false;
        }

        //backtract case
        if(board[r][c]==' '|| board[r][c]!=word.charAt(wordIndex)){
            return false;
        }
        char ch=board[r][c];
        board[r][c]=' ';
        if(dfs(board,r-1,c,word,wordIndex+1)||
            dfs(board,r,c+1,word,wordIndex+1)||
            dfs(board,r+1,c,word,wordIndex+1) ||
            dfs(board,r,c-1,word,wordIndex+1)){
            return true;
        }
        //backtrack
        board[r][c]=ch;
        return false;
    }
}