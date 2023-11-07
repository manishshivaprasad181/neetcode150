class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] timetaken=new double[dist.length];
        for(int i=0;i<dist.length;i++)
        {
            timetaken[i]=(double)dist[i]/speed[i];
        }
        Arrays.sort(timetaken);
        int count=0;
        for(int i=0;i<timetaken.length;i++)
        {
                if(timetaken[i]<=i)
                break;
                count++;
        }
     return count;
        
    }
}
