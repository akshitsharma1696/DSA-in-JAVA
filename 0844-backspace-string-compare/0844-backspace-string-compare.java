class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n=s.length();
        int m=t.length();
        Stack<Character>st=new Stack<>();
        Stack<Character>st1=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }else if(!st.isEmpty()){
                st.pop();
            }
        } 
        for(int i=0;i<m;i++){
            if(t.charAt(i)!='#'){
                st1.push(t.charAt(i));
            }else if(!st1.isEmpty()){
                st1.pop();
            }
        }   
        return st.equals(st1);
    }
}