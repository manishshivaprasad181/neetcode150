class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        int j=1;
        for(int i=0;i<intervals.length-1;i++) {
            if(intervals[i][1]>intervals[j][0])
                return false;
            j++;
        }
        return true;
    }
}
