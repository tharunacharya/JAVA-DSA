class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}