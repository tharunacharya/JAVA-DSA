class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> cur=new ArrayList<>();
        sub(0,s,cur,res);
        return res;
        
    }
    private void sub(int index,String s, List<String> cur, List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isplaindrome(index,i,s)){
                cur.add(s.substring(index,i+1));
                sub(i+1,s,cur,res);
                cur.remove(cur.size()-1);
            }
        }


    }

    private boolean isplaindrome(int index, int i, String s){
        while(index<i){
            if(s.charAt(index)!=s.charAt(i)){
                return false;
            }
            index++;
            i--;
        }
        return true;
    }
}