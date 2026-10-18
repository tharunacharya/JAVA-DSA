class Solution {
    public int minSwaps(String s) {
        int open=0;
        int n=s.length();
        int close=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='['){
                open++;
            }else{
                if(open<=0){
                    close++;
                }else{
                    open--;
                }
            }

        }
        return (close+1)/2;
    }

}