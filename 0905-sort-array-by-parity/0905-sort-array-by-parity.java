class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int []arr=new int [n];
        int even=0;
        //int odd=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) arr[even++]=nums[i];
        }
       for(int i=0;i<n;i++){
            if(nums[i]%2!=0) arr[even++]=nums[i];
        }
        return arr;
    }
}