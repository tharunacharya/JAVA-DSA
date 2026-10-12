class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int open=0;
        int close=0;
        for(int i=0;i<n;i++){
            char c =s.charAt(i);
            if(c=='('){
                open++;
            }else{
                if(open<=0){
                    close++;
                }else{
                    open--;
                }
            }
        }
        return (open+close);
    }
}