class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        sub(0,nums, new ArrayList<>(), res);
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
        // remove all deuplicates
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        sub(i+1,nums,cur,res);
    }
}