class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int r=0;
        int l=n-1;
        int m=n/2;
        int count=0;
        int count1=0;
      for(int i=0;i<m;i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            count++;
        }
      }
      for(int i=n-1;i>=m;i--){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            count1++;
        }
      }
      if(count!=count1)return false;
      return true;
    }
}