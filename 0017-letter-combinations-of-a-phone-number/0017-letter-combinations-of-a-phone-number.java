class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map =new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
         List<String> res = new ArrayList<>();
        com(0, res,new StringBuilder(""), map,digits);
        return res;
    }

    private void com(int index, List<String> res,StringBuilder cur,HashMap<Character,String> map, String digits){
        if(index==digits.length()){
            res.add(cur.toString());
            return;
        }
        char digit=digits.charAt(index);
        String letters=map.get(digit);
        for(int i=0;i<letters.length();i++){
            cur.append(letters.charAt(i));
            com(index+1,res,cur,map,digits);
            cur.deleteCharAt(cur.length()-1);
        }

    }
}