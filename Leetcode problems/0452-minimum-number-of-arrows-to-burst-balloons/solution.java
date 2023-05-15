class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;

        Arrays.sort(points, (a,b)->Integer.compare(a[1],b[1]));
        int arrows=1;
        int xstart,xend,firstend=points[0][1];
        for(int[] point:points) {
            xstart=point[0];
            xend=point[1];
            if(firstend<xstart)  {
                arrows++;
                firstend=xend;
            }
        }
        return arrows;
    }
}
