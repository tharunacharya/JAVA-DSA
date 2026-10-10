class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>max){
                return false;
            }
            max=Math.max(max,i+nums[i]);
            if(max>=n-1){
                return true;
            }
        }
        return false;
    }
}

//     public boolean rec(int pos, int[] nums){
//         //base case
//         if(pos==nums.length-1){
//             return true;
//         }

//         int max=Math.min(pos+nums[pos],nums.length-1);

//         for(int i=max;i>pos;i--){
//             if(rec(i,nums)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }