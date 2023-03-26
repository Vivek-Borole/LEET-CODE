class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            
            minSoFar = Math.min(minSoFar,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minSoFar);
        }
        return maxProfit;
    }
}