class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder cur= new StringBuilder();
        int open=0;
        int close=0;
        gen(res,cur,open,close,n);
        return res;
    }
    private void gen(List<String> res, StringBuilder cur, int open, int close, int n){
        if(open==n && close==n){
            res.add(cur.toString());
            return;
        }

        //for open
        if(open<n){
            cur.append("(");
            gen(res,cur,open+1,close,n);
            cur.deleteCharAt(cur.length()-1);
        }

        //for close
        if(close<n && close<open){
            cur.append(")");
            gen(res,cur,open,close+1,n);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}