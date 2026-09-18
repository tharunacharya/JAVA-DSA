class Solution {
    // public int minCostClimbingStairs(int[] cost) {
    //     int res=rec(cost.length,cost);
    //     return res;
    // }
    // private int rec(int n,int []cost){
    //     if(n<=1){
    //         return 0;
    //     }
    //     int oneStep=cost[n-1]+rec(n-1,cost);
    //     int twoStep=cost[n-2]+rec(n-2,cost);
    //     return Math.min(oneStep,twoStep);
    // }

    //Top Down Approach
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int res=rec(n,cost,dp);
        return res;
    }
    private int rec(int n,int []cost,int dp[]){
        if(n<=1){
            dp[n]=0;
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int oneStep=cost[n-1]+rec(n-1,cost,dp);
        int twoStep=cost[n-2]+rec(n-2,cost,dp);
        dp[n]=Math.min(oneStep,twoStep);
        return dp[n];
    }
}