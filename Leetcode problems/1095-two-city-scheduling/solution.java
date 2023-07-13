class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(a->(a[0]-a[1])));

        int n = costs.length/2;
        
        int maxSum =0;

        for(int i =0;i<n;i++) {
            maxSum+= costs[i][0];
            maxSum+= costs[i+n][1];
        }
        return maxSum;
    }
}
