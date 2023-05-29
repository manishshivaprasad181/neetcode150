class Solution {
    public Integer[] memo;
    public int coinChange(int[] coins, int amount) {
        memo=new Integer[amount+1];
        return recursionhelper(coins,amount);
    }
    public int recursionhelper(int[] coins,int remain){
        if(remain<0)return -1;
        if(remain==0)return 0;
        if(memo[remain]!=null)return memo[remain];
        int mincount=Integer.MAX_VALUE;
        for(int coin:coins)
        {
            int count=recursionhelper(coins,remain-coin);
            if(count==-1)continue;
            mincount=Math.min(mincount,count+1);
        }
        memo[remain]=mincount==Integer.MAX_VALUE?-1:mincount;
        return memo[remain];
    }
}
