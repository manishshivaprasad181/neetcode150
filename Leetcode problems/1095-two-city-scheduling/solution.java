class Solution {
    public int twoCitySchedCost(int[][] costs) {
       Arrays.sort(costs, Comparator.comparingInt(a->(a[0]-a[1])));

       int minSum =0;

       int n = costs.length/2;;

       for(int i=0;i<n;i++) {
           minSum+= costs[i][0];
           minSum+= costs[i+n][1];
       }
       return minSum;
    }
}
