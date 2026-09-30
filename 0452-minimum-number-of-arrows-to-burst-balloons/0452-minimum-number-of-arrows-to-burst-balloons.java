class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        Arrays.sort(points, (a,b)->(a[1]<=b[1])?-1:1);
        int arr=1;
        int lastEnd=points[0][1];
        for(int point[] : points){
            if(point[0]>lastEnd){
                arr++;
                lastEnd=point[1];
            }
        }
        return arr;
        
    }
}