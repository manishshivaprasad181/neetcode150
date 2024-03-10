class Solution {
    private Integer[] memo;
    public int coinChange(int[] coins, int amount) {
        memo = new Integer[amount+1];
        return recursionhelper(coins, amount);
    }
    private int recursionhelper(int[] coins, int remain) {
        if(remain<0)
            return -1;
        if(remain==0)
            return 0;

        if(memo[remain]!=null) return memo[remain];

        int minCount= Integer.MAX_VALUE;

        for(int coin:coins) {
            int count = recursionhelper(coins, remain-coin);
            if(count==-1) continue;
            minCount = Math.min(minCount, count+1);
        }
        memo[remain] = minCount==Integer.MAX_VALUE?-1:minCount;
        return memo[remain];
    }
}
