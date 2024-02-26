class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int N = points.length;
        int[] dist = new int[N];

        for(int i=0;i<points.length;i++) {
            dist[i] = finddist(points[i]);
        }

        Arrays.sort(dist);
        int distK = dist[k-1];
        int j=0;
        int[][] ans = new int[k][2];
        for(int i=0;i<N;i++) {
            if(finddist(points[i])<=distK) 
            ans[j++] = points[i];
        }
        return ans; 
    }
    public int finddist(int[] point) {
        return point[0]*point[0]+ point[1]*point[1];
    }
}
