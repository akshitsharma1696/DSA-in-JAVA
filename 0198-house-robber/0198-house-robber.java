class Solution {
    public int rob(int[] nums) {
        int prev=0;
        int curr=0;
        for(int i:nums){
            int take=prev+i;
            int skip=curr;
            int temp=Math.max(take,curr);
            prev=curr;
            curr=temp;
        }
        return curr;
    }
}