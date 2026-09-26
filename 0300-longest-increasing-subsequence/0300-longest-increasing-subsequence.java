class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,1);
        int maxLen=1;
        for(int i=1;i<n;i++){
            for(int p=0;p<i;p++){
                if(nums[i]>nums[p]){
                    dp[i]=Math.max(dp[i],1+dp[p]);
                }

            }
            maxLen=Math.max(maxLen,dp[i]);
        }
        return maxLen;
    }
    // public int lis(int nums[],int i, int p){
    //     if(i==nums.length){
    //         return 0;
    //     }

    //     int pick=0;
    //     if(p==-1 || nums[i]>nums[p]){
    //         pick=1+lis(nums,i+1,i);
    //     }
    //     int noPick=lis(nums,i+1,p);
    //         return Math.max(pick,noPick);

    // }
}