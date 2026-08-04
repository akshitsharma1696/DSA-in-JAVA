class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        int min=nums[0];
        int max=nums[0];
        for(int i:nums){
            set.add(i);
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}