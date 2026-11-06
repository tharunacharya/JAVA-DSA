class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // to slove this , first take the counts of each students 
        int counts[]=new int[2];

        //take the total count of the student
        for(int student: students){
            counts[student]++; //count[0,0] and increments
        }

        for(int sandwitch: sandwiches){
            if(counts[sandwitch]>0){
                counts[sandwitch]--;
            }else{
                break;
            }
        }
        return counts[0]+counts[1];
    }
}