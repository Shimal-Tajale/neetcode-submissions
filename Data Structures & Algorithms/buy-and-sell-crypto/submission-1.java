class Solution {
    public int maxProfit(int[] prices) {
        int currentLow = prices[0];
        int difference = 0;
        int bestProfit = 0;

        for (int i = 1; i < prices.length; i++){
            if (currentLow > prices[i]){
                currentLow = prices[i];
            }
            
            difference = prices[i] - currentLow;

            if (difference > bestProfit){
                bestProfit = difference;
            }
        }

        return bestProfit;
        
    }
}
