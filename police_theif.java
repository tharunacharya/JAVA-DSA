class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n =arr.length;
        int p=0;
        int t=0;
        int count=0;
        
        while(p<n && t<n){
            while(p<n && arr[p]=='P'){
                p++;
            }
            while(t<n && arr[t]=='T'){
                t++;
            }
            if (p == n || t == n) {
                            break;
                        }
            
            if(Math.abs(p-t)<=k){
                count++;
                p++;
                t++;
            }else if(p<t){
                p++;
            }else{
                t++;
            }
        }
        return count;
    }
}
