class Solution {
    public int maxProduct(int n) {
        int max1=0,max2=0;
       while(n>0){
        int a=n%10;
        if(max1<a){
            max2=max1;
            max1=a;
        }else if(max2<a){
            max2=a;
            
        }
        n/=10;
       }
       return max1*max2;
    }
}