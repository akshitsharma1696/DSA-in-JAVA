class Solution {
    public int[] runningSum(int[] nums) {
        int prefix[]=new int [nums.length];
        int a=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefix[a++]=sum;
        }
        return prefix;
    }
}