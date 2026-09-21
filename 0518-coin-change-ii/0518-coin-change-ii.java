class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int prev[]=new int[amount+1];

        for(int a=0;a<amount+1;a++){
            if(a%coins[0]==0){
                prev[a]=1;
            }else{
            prev[a]=0;
            }
        }

        for(int i=1;i<n;i++){
            int cur[]=new int[amount+1];
            for(int j=0;j<amount+1;j++){
                int pick=0;
                if(j>=coins[i]){
                    pick=cur[j-coins[i]];
                }
                int noPick=prev[j];
                cur[j]=pick+noPick;
                }
                prev=cur;
            }

            return prev[amount];
    }
}