class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=wt.length;
        int dp[][]=new int[n][W+1];
        
        int prev[]=new int[W+1];
        
            prev[0]=0;
            
        for(int c=0;c<W+1;c++){
            if(wt[0]<=c){
                prev[c]=val[0];
            }else{
                prev[c]=0;
            }
        }
        
        
        for(int i=1;i<n;i++){
            int cur[]=new int[W+1];
            cur[0]=0;
            for(int j=1 ;j<W+1;j++){
                int pick=0;
                if(wt[i]<=j){
                    pick=val[i]+prev[j-wt[i]];
                }
                int noPick=0+prev[j];
                cur[j]=Math.max(pick,noPick);
            }
            prev=cur;
        }
        return prev[W];
    }
    
    // public int rec(int w,int val[],int wt[],int i,int dp[][]){
    //     //base case
    //     if(w==0){
    //         dp[i][w]=0;
    //         return 0;
    //     }
        
    //     if(i==0){
    //         if(wt[i]<=w){
    //             dp[i][w]=val[i];
    //             return val[i];
    //         }else{
    //             dp[i][w]=0;
    //             return 0;
    //         }
    //     }
    //     if(dp[i][w]!=-1){
    //         return dp[i][w];
    //     }
        
    //     int pick=0;
    //     if(wt[i]<=w){
    //         pick=val[i] + rec(w-wt[i],val,wt,i-1,dp);
    //     }
    //     int noPick=0+rec(w,val,wt,i-1,dp);
    //     dp[i][w]=Math.max(pick,noPick);
        
    //     return dp[i][w];
    // }
}
