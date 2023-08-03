class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

         List<int[]> mergeIntervals = new ArrayList<>();

         int[] currentInterval = intervals[0];
         for(int i=1;i<intervals.length;i++) {
             if(intervals[i][0]<= currentInterval[1])
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            else {
                mergeIntervals.add(currentInterval);
                currentInterval = intervals[i];
            }
         }
         mergeIntervals.add(currentInterval);
         return mergeIntervals.toArray(new int[mergeIntervals.size()][]);



    }
}

