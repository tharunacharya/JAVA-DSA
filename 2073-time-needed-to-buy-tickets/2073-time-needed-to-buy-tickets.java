class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int value = tickets[k]; // Target tickets needed by person k
        
        // DRY RUN EXAMPLE: tickets = [3, 2, 4], k = 1 
        // value (target) = tickets[1] = 2
        
        for(int i = 0; i < tickets.length; i++) {
            if(i <= k) {
                // People at or in front of k. 
                // They can buy up to 'value' tickets before k finishes.
                // For i=0 (wants 3): min(3, 2) -> adds 2 to time
                // For i=1 (wants 2): min(2, 2) -> adds 2 to time
                time += Math.min(tickets[i], value);
            } else {
                // People strictly behind k.
                // Since the process stops exactly when k finishes their last ticket,
                // people behind k miss out on that final round.
                // For i=2 (wants 4): min(4, 2 - 1) -> adds 1 to time
                time += Math.min(tickets[i], value - 1);
            }
        }
        
        // Total time = 2 + 2 + 1 = 5
        return time;
    }
}