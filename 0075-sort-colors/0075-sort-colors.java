class Solution {
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
       }

    public void sortColors(int[] nums) {
        int n=nums.length;
       int start=0;
       int end=n-1; 
       int index=0;
       while(index<=end){
        if(nums[index]==0){
            swap(nums,start,index);
            start++;
            index++;
        }else if(nums[index]==2){
            swap(nums,end,index);
            end--;
        }else{
            index++;
        }
       }
       
    }
}