class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a->a[1]));

        int ans=0;
        int n =intervals.length;
        int k = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            int x =intervals[i][0];
            int y = intervals[i][1];
            
            if(x>=k)
                k=y;
            else
                ans++;
        }
        return ans;
    }
}
