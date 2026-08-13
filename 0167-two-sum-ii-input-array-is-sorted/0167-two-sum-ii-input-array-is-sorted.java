class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int n=numbers.length;
        int j=n-1;
        int[] ans=new int[2];
        while(i<j){
            int res=numbers[i]+numbers[j];
            if(res==target){
                ans[0]=i+1;
                ans[1]=j+1;
            }
            if(res<target){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}