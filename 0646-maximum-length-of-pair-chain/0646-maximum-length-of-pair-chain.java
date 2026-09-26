class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[0]-b[0]);
        int n=pairs.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<n;i++){
            for(int p=0;p<i;p++){
                if(pairs[p][1]<pairs[i][0]){
                    dp[i]=Math.max(dp[i],1+dp[p]);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }

    // public int lis(int arr[]){
    //     int n=arr.length;
    //     int dp[]=new int[n+1];
    //     Arrays.fill(dp,1);
    //     int max=1;
    //     for(int i=1;i<n;i++){
    //         for(int p=0;p<i;p++){
    //             if(dp[p]<dp[i]){
    //                 dp[i]=Math.max(dp[i],1+dp[p]);
    //             }
    //         }
    //         max=Math.max(max,dp[i]);
    //     }
    //     return max;
    // }
}