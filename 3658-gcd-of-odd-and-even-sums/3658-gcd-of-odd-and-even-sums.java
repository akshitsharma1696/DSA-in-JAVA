class Solution {
    public int gcdOfOddEvenSums(int n) {
       int even=0,odd=0;
       for(int i=1;i<=n;i++){
        even+=(2*i);
        odd+=(2*i-1);
       }
       int gcd;
       while(odd!=0){
        gcd=odd;
        odd=even%odd;
        even=gcd;
        
       }
       return even;
    }
}