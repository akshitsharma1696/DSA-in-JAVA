class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int minh=0;
        int maxw=0;
        while(left<right){
            int width=right-left;
           
            if(height[left]<height[right]){
                minh=height[left];
                left++;
            }else{
                minh=height[right];
                right--;
            }
            int max=width*minh;
            if(max>maxw)maxw=max;
        
        }
        return maxw;

     
    }
}



         