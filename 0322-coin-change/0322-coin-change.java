class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];

        for(int a=0;a<amount+1;a++){
            if(a%coins[0]==0){
                dp[0][a]=a/coins[0];
            }else{
            dp[0][a]=(int)(1e9);
            }
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<amount+1;j++){
                int pick=(int)(1e9);
        if(j>=coins[i]){
            pick=1+dp[i][j-coins[i]];
        }
        int noPick=0+dp[i-1][j];
        dp[i][j]=Math.min(pick,noPick);
            }
        }
        if(dp[n-1][amount]==(int)(1e9)){
            return -1;
        }else{
            return dp[n-1][amount];
        }
    }
}
// public int rec(int[] coins, int amount, int i,int dp[][]){
//         //base case
//         if(i==0){
//             if(amount%coins[i]==0){
//                 dp[i][amount]=amount/coins[i];
//                 return amount/coins[i];
//             }
//             dp[i][amount]=(int)(1e9);
//             return (int)(1e9);
//         }

//         if(dp[i][amount]!=-1){
//             return dp[i][amount];
//         }

//         int pick=(int)(1e9);
//         if(amount>=coins[i]){
//             pick=1+rec(coins,amount-coins[i],i,dp);
//         }
//         int noPick=0+rec(coins,amount,i-1,dp);
//         dp[i][amount]=Math.min(pick,noPick);
//         return dp[i][amount];

//     }



// }