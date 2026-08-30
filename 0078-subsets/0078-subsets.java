class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        sub(0,nums, cur, res);
        return res;
        
    }
    private void sub(int i, int[] nums,List<Integer> cur,List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        //pick
        cur.add(nums[i]);
        sub(i+1,nums,cur,res);

        //no pick
        cur.remove(cur.size()-1);
        sub(i+1,nums,cur,res);
    }
}