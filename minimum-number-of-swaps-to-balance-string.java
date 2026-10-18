class Solution {
    static int minimumNumberOfSwaps(String s) {
        // code here
        int open=0;
        int close=0;
        int unBalanced=0;
        int swaps=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='['){
                open++;
                if(unBalanced>0){
                    swaps+=unBalanced;
                    unBalanced--;
                }
                }else{
                    close++;
                    unBalanced=close-open;
                }
            }
        return swaps;
    }
}
