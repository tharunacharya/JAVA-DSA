class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int start=0;
        int end=0;
        int maxLen=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        while(end<n){
            char rChar=s.charAt(end);
            while(map.containsKey(rChar) && map.get(rChar)>=start){
                start=map.get(rChar)+1;
            }
            map.put(rChar,end);
            maxLen=Math.max(maxLen,end-start+1);
            end++;
        }
        return (maxLen==Integer.MIN_VALUE)?0:maxLen;
    }
}