class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int left = 0, right = 1;

        while(right < prices.length && left < right) {
            if(prices[left] > prices[right])
                left = right;
            if((prices[right] - prices[left]) > profit)
                profit = prices[right] - prices[left];
            right++;
        }


        return profit;
    }
}
