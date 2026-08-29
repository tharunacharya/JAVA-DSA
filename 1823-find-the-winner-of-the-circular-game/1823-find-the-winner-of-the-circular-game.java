class Solution {
    public int findTheWinner(int n, int k) {
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=(ans+k)%i;
        }
        return ans+1;
       /* return find(n,k)+1;
    }
    private int find(int n,int k){
        if(n==1){
            return 0;
        }
        return (find(n-1,k)+k)%n;*/
    }
}