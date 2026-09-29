class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        Integer indexArr[]=new Integer[n];
        for(int i=0;i<n;i++){
            indexArr[i]=i;
        }
        Arrays.sort(indexArr,(a,b)->(finish[a]-finish[b]));
        int max=1;
        int lastEnd=finish[indexArr[0]];
        for(int i=1;i<n;i++){
            int index=indexArr[i];
            if(start[index]>lastEnd){
                max++;
                lastEnd=finish[index];
            }
        }
        return max;
    }
}
