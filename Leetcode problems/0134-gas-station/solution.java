class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currgain =0;
        int totalgain=0;
        int ans=0;
        for(int i=0;i<gas.length;i++){
            totalgain+= gas[i]-cost[i];
            currgain+= gas[i]-cost[i];
            if(currgain<0) {
                ans=i+1;
                currgain=0;
            }
        }
        return totalgain>=0?ans:-1;
    }
}
