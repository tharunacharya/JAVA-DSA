class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0||obstacleGrid[i-1][j-1]==1){
                    dp[i][j]=0;
                }else if(i==1 && j==1){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[n][m];
    }
    // public int rec(int n,int m, int[][] grid,int dp[][]){
    //     //base case 
    //     if(n==0 || m==0 || grid[n-1][m-1]==1){
    //         dp[n][m]=0;
    //         return 0;
    //     }
    //     if(n==1 && m==1){
    //         dp[n][m]=1;
    //         return 1;
    //     }
    //     if(dp[n][m]!=-1){
    //         return dp[n][m];
    //     }

    //     dp[n][m]=rec(n-1,m,grid,dp)+rec(n,m-1,grid,dp);
    //     return dp[n][m];
    // }
}