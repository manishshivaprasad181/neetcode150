class Solution {
    int[][] grid;
    boolean[][] seen;
    public int area(int i,int j) {
        if(i<0 || i>= grid.length|| j<0 || j>= grid[0].length || seen[i][j] || grid[i][j]==0)
            return 0;
        seen[i][j] = true;
        return (1+area(i+1,j)+area(i,j+1)+area(i-1,j)+ area(i,j-1));
    }
    public int maxAreaOfIsland(int[][] grid) {
       this.grid = grid;
       seen = new boolean[grid.length][grid[0].length];
        int ans =0;

       for(int i=0;i<grid.length;i++) {
           for(int j=0;j<grid[0].length;j++) {
               ans = Math.max(ans, area(i,j));
           }
       }
       return ans;
    }
}
