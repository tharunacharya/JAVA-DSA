class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        if(n==0){
            return res;
        }
        Deque<Integer> dq= new ArrayDeque<Integer>();
        int index=0;
        while(index<k){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[index]){
                dq.pollLast();
            }
            dq.offerLast(index);
            res[0]=nums[dq.peekFirst()];
            index++;
        }

        for(int i=1;i<n-k+1;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-1){
                dq.pollFirst();

            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i+k-1]){
                dq.pollLast();
            }
            dq.offerLast(i+k-1);
            res[i]=nums[dq.peekFirst()];
            
        }
        return res;

    }
}