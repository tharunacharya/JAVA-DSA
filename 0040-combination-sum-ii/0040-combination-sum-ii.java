class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res= new ArrayList<>();
        com(0,new ArrayList<>(), res, candidates, target);
        return res;
    }
    private void com(int index,List<Integer> cur,  List<List<Integer>> res , int[] candidates,int target){
        if(target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i==index || candidates[i]!=candidates[i-1] && candidates[i]<=target){
                cur.add(candidates[i]);
                com(i+1,cur,res,candidates,target-candidates[i]);
                cur.remove(cur.size()-1);
            }
        }
    }
}