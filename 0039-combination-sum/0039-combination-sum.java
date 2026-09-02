class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        com(0,new ArrayList<>(),res,candidates,target);
        return res;
    }
    private void com(int i, List<Integer> cur, List<List<Integer>> res, int[] candidates, int target){
        if(target==0){
            res.add(new ArrayList<>(cur));
            return;
        }

        if(i==candidates.length){
            return;
        }

        //pick
        if(candidates[i]<=target){
            cur.add(candidates[i]);
            com(i,cur,res,candidates,target-candidates[i]);
            cur.remove(cur.size()-1);
        }

        //no pick
        com(i+1,cur,res,candidates,target);
    }
}