class Solution {
    public int maxProfit(int[] prices) {
        int currentProfit = 0;
        int maxProfit = 0;
        int costPrice = 0;
        for(int i = 0; i < prices.length; i++) {
            if(i == 0) { costPrice = arr[i]; continue;}
            if(arr[i] - costPrice < 0) costPrice = arr[i];
            else {
                currentProfit = arr[i] - costPrice;
                maxProfit = Math.max(currentProfit , maxProfit);
            }
            currentProfit = 0;
        }
        return maxProfit;
    }
}
