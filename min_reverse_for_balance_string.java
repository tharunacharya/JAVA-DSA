class Solution {
    public int countMinReversals(String s) {
        // code here1
        int n=s.length();
        if(n%2!=0){
            return -1;
        }
        
        int open=0;
        int close=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='{'){
                open++;
            }else{
                if(open<=0){
                    close++;
                }
                else{
                    open--;
                }
            }
        }
        int res=(int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));
        return res;
    }
}
