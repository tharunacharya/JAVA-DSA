class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char c =s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                if(c==')' && top!='(' || c=='}' && top!='{' || c==']' && top!='['){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.size()==0;
    }
}