class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int k=0;
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[k++]=0;
            }
        }
        for( int i=0;i<n;i++){
            if(nums[i]%2!=0) arr[k++]=1;
        }
         return arr;
    }
}