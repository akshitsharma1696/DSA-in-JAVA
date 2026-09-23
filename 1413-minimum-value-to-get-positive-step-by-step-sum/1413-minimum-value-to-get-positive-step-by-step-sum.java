class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
       int sum=0;
       int msum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
       
       msum=Math.min(sum,msum);
       }
    return 1-msum;
    }
}