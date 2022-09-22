class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0 ;
        int buy = prices[0];
        for(int i = 1; i < n; i++){
            if(prices[i] < buy)
                buy = prices[i];
            
            else{
                int sell = prices[i] - buy;
                profit = max(profit , sell);
            }
            
        }
        
        return profit;
    }
    
    public int max(int x , int y){
        if(x > y){
            return x;
        }
        return y;
    }
}