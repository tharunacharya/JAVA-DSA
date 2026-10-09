class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int res=0;
        for(int boxtype[]:boxTypes){
            if(boxtype[0]>=truckSize){
                res+=truckSize*boxtype[1];
                truckSize=0;
            }else{
                res+=boxtype[0]*boxtype[1];
                truckSize-=boxtype[0];
            }
            if(truckSize==0){
                break;
            }
        }
        return res;
    }
}