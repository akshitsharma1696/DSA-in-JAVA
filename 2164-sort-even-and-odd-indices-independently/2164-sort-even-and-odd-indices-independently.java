class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int []even=new int [(n+1)/2];
        int []odd =new int [n/2];
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[e++]=nums[i];
            }
            else{
                odd[o++]=nums[i];
            }

        }
        e=0;
        o=odd.length-1;
        Arrays.sort(even);
        Arrays.sort(odd);
        for(int i=0;i<n;i+=2){
           
                nums[i]=even[e++];
            
            
        }
        
        for(int i=1;i<n;i+=2){
            
                nums[i]=odd[o--];
            
        }
        return nums;
    }
}