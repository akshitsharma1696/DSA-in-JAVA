class Solution {
    public int reverse(int x) {
        int s=-1;
        long rev=0;
        int n=Math.abs(x);
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(x<0)rev=rev*s;
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)return 0;
        return (int)rev;
        
    }
}