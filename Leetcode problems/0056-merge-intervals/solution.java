class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        List<int[]> mergeintervals = new ArrayList<>();
        int[] currentinterval = intervals[0];
        for(int i =1;i<intervals.length;i++) {
            if(intervals[i][0]<= currentinterval[1]) {
                currentinterval[1] = Math.max(currentinterval[1], intervals[i][1]);
            } else {
                mergeintervals.add(currentinterval);
                currentinterval = intervals[i];
            }

        }
        mergeintervals.add(currentinterval);
        return mergeintervals.toArray(new int[mergeintervals.size()][]);
        }
    }

