class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        Arrays.sort(nums);
        int a= nums[0];
        for(int i=1;i<nums.length;i++){
            while(nums[i]!=a+1){
                ans.add(++a);
            }
            a=nums[i];
        }
        return ans;
    }
}