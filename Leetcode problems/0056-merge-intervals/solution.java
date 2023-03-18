class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> mergedIntervals=new ArrayList<>();
        int [] currentinterval=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if (intervals[i][0] <= currentinterval[1])
           currentinterval[1] = Math.max(currentinterval[1], intervals[i][1]);
         else {
            mergedIntervals.add(currentinterval);
            currentinterval = intervals[i];
        }
    }
    
    mergedIntervals.add(currentinterval); // Step 7
    
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
        }
        
        
    }

