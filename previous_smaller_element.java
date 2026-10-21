class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(-1);
            }else{
                res.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
