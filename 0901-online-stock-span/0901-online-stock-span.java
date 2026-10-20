class StockSpanner {

    Stack<Integer> stack;
    ArrayList<Integer> list;
    public StockSpanner() {
        stack=new Stack<>();
        list=new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        while(!stack.isEmpty() && price>=list.get(stack.peek())){
            stack.pop();
        }
        int prev=(stack.isEmpty())?-1:stack.peek();
        int cur=list.size()-1;
        int ans = cur-prev;
        stack.push(cur);
        return ans;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */