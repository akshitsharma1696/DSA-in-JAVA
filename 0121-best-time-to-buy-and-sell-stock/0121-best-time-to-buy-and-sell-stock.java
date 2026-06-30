class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxP=0;
        int min=prices[0];
        for(int i=1;i<n;i++){
           if(prices[i]<min){
            min=prices[i];
           }
           int prof=prices[i]-min;
           if(prof>maxP){
            maxP=prof;
           }
            
        }
        
        
        return maxP;
    }
}