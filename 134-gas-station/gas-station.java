class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curgain=0,totalgain=0,answer=0;
        for(int i=0;i<gas.length;i++)
        {
            totalgain+=gas[i]-cost[i];
            curgain+=gas[i]-cost[i];
            if(curgain<0)
            {
                answer=i+1;
                curgain=0;
            }
        }
        return totalgain>=0?answer:-1;
    }
}