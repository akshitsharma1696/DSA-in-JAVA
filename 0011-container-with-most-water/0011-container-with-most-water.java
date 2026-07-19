class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxw=0;
        int right=n-1;
        int left=0;
        while(left<right){
            int width=right-left;
            int minh;
            if(height[right]<height[left]) {
                minh=height[right];
                right--;
                }
            else {
                minh=height[left];
                left++;
                }
            int water=width*minh;
            if(water>maxw) maxw= water;

        }
        return maxw;
    }
}



            // for(int j=i+1;j<n;j++){
            //     int width=j-i;
            //     int minh;
            //     if(height[i]<height[j]) minh=height[i];
            //     else minh=height[j];
            //     int water=width*minh;
            //     if(water>maxw) maxw= water;
            // }