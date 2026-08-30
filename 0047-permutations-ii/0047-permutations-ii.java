class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];
        per(nums,seen,cur,res);
        return res;

    }

    private void per(int[] nums,boolean[] seen, List<Integer> cur, List<List<Integer>> res){

        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++){
        if(seen[i]) continue;

        if(i>0 && nums[i]==nums[i-1] && !seen[i-1]) continue;
        seen[i]=true;
        cur.add(nums[i]);
        per(nums,seen,cur,res);
        cur.remove(cur.size()-1);
        seen[i]=false;
        }
    }
}