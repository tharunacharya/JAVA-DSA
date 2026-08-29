class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> ring=new LinkedList<>();
        for(int i=1;i<=n;i++){
            ring.offer(i);
        }

        while(ring.size()>1){
            for(int i=0;i<k-1;i++){
                ring.offer(ring.poll());
            }
            ring.poll();

        }
        return ring.peek();
        
    }
}