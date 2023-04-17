class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int startStation =0;
        int curr_tank =0;
        int total_tank =0;
        for(int i =0;i<n;i++) {
            curr_tank+=gas[i]-cost[i];
            total_tank+= gas[i]-cost[i];
            if(curr_tank<0) {
                startStation=i+1;
                curr_tank=0;
            }
        }
        return total_tank>=0?startStation:-1;
        
    }
}
