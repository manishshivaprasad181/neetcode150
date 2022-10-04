class Solution {
    public int maxProfit(int[] prices) {
        int min =100000;
        int maxdiff = 0;
        int size = prices.length;
        for(int i=0;i<size;i++)
        {
            min = Math.min(prices[i], min);
            maxdiff = Math.max(prices[i]-min, maxdiff);
        }
        return maxdiff;
    }
}
