class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> freMap= new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            freMap.put(ch,freMap.getOrDefault(ch,0)+1);
        }
        int start=0;
        int end=0;
        int minLen=Integer.MAX_VALUE;
        int ucc=freMap.size();
        int si=-1;
        int n=s.length();
        while(end<n){
            //expansion
            char ch=s.charAt(end);
            if(freMap.containsKey(ch)){
                freMap.put(ch,freMap.get(ch)-1);
                    if(freMap.get(ch)==0){
                        ucc--;
                    }
            }
            //shrinking
            while(ucc==0){
                int len = end-start+1;
                if(len<minLen){
                    minLen=len;
                    si=start;
                }
                ch=s.charAt(start);
                if(freMap.containsKey(ch)){
                    freMap.put(ch,freMap.get(ch)+1);
                    if(freMap.get(ch)>0){
                        ucc++;
                    }
                }
                start++;
            }
            end++;

        }
        if(si==-1){
            return "";
        }
        return s.substring(si,si+minLen);
    }
}