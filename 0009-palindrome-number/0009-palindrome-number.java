class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        long b=0;
        int c=x;
        while(x>0){
            int a=x%10;
            b=b*10+a;
            x=x/10;
        }
        return c==b;
    }
}