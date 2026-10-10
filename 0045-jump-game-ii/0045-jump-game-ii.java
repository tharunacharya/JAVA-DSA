class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int currEnd=0;
        int max=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i==currEnd){
                jump++;
                currEnd=max;
            }
            if(currEnd>=n-1){
                break;
            }
        }
        return jump;
    }
}