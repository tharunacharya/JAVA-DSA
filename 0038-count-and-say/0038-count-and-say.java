class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String prev=countAndSay(n-1);
        StringBuilder res = new StringBuilder("");
        int count =0;
        int l=prev.length();
        for(int i=0;i<l;i++){
            count++;
            if(i==l-1 || prev.charAt(i)!=prev.charAt(i+1)){
                res.append(count).append(prev.charAt(i));
                count=0;
            }
        }
        return res.toString();

    }
}