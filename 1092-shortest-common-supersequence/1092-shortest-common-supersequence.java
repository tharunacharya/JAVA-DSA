class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int dp[][] = lcs(str1, str2);
        int n = dp.length;
        int m = dp[0].length;
        int i=n-1;
        int j=m-1;
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){ //lcs
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                sb.append(str1.charAt(i-1));
                i--;
            }else {
                sb.append(str2.charAt(j-1));
                j--;
            }
        }
        while(i>0) {
            sb.append(str1.charAt(i-1));
            i--;
        }
        while(j>0) {
            sb.append(str2.charAt(j-1));
            j--;
        }
        return sb.reverse().toString();
    }
    public int[][] lcs(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int dp[][]=new int[n1+1][n2+1];
        dp[0][0]=0;
        for(int i=1;i<n1+1;i++){
            for(int j=1;j<n2+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    int cas1=dp[i-1][j];
                    int cas2=dp[i][j-1];
                    dp[i][j]=Math.max(cas1,cas2);
                }
            }
        }
        return dp;
    }
}