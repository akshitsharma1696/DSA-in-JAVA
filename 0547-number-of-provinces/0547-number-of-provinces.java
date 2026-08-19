class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count =0;
        int n=isConnected.length;
        boolean[]isvisited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!isvisited[i]){
                dfs(i,isvisited,isConnected);
                count++;
            }
        }
        return count;
    }
    public void dfs(int i,boolean[]isvisited,int [][]isConnected){
        Queue<Integer>q=new LinkedList<>();
        isvisited[i]=true;
        q.add(i);
        while(!q.isEmpty()){
            int fr=q.poll();
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[fr][j]==1 && !isvisited[j]){
                    q.add(j);
                    isvisited[j]=true;
                }
            }
        }
    }
}