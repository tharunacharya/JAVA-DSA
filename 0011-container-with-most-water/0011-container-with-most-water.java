class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int ans=Integer.MIN_VALUE;
        while(i<j){
            int distance=j-i;
            int minHeight=Math.min(height[i],height[j]);
            int res=distance*minHeight;
            ans=Math.max(ans,res);
            while(i<j && height[i]<=minHeight){
                i++;
            }
            while(i<j && height[j]<=minHeight){
                j--;
            }
        }
        return ans;
    }
}