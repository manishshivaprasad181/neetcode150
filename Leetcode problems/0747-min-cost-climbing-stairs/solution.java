class Solution {
    private HashMap<Integer, Integer> hm = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        return minimumCost(cost.length,cost);
        
    }

    private int minimumCost(int i, int[] cost) {
        if(i<=1)
            return 0;
        
        if(hm.containsKey(i))
            return hm.get(i);
        
        int downOne = cost[i-1]+ minimumCost(i-1, cost);
        int downTwo = cost[i-2]+ minimumCost(i-2, cost);
        hm.put(i, Math.min(downOne,downTwo));
        return hm.get(i);
    }
}
