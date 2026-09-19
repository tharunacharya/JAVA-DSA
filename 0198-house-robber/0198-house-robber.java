class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
    return rec(nums,n,dp);
    }
    private int rec(int []nums,int i,int []dp){
        if(i==1){
            dp[i]=nums[0];
            return nums[0];
        }
        if(i==0){
            dp[i]=0;
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int pick=nums[i-1]+rec(nums,i-2,dp);
        int unpick=0+rec(nums,i-1,dp); 
        dp[i]=Math.max(pick,unpick);
        return dp[i];
    }
}