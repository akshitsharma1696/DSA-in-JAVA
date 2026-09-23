class Solution {
    public int maxScore(String s) {
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')right++;
            
        }
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0')left++;
            else right--;
            int score=right+left;
            ans=Math.max(score,ans);
        }
        return ans;
    }
}