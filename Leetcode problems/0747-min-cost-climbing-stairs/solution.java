class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] mincost = new int[cost.length+1];

        for(int i=2;i<mincost.length;i++) {
            int takeOneStep = mincost[i-1]+cost[i-1];
            int takeTwoStep = mincost[i-2]+cost[i-2];
            mincost[i] = Math.min(takeOneStep, takeTwoStep);
        }
        return mincost[mincost.length-1];
    }
}
