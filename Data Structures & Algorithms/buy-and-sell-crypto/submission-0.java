class Solution {
    public int maxProfit(int[] prices) {
        int currentLow = prices[0];
        int difference = 0;
        int bestProfit = 0;

        for (int i = 0; i < prices.length; i++){
            currentLow = Math.min(prices[i], currentLow);
            difference = prices[i] - currentLow;

            if (difference > bestProfit){
                bestProfit = difference;
            }
        }

        return bestProfit;
        
    }
}
