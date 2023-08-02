class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish =0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(!visited[i][j] && grid[i][j]>0)
                    maxFish = Math.max(maxFish, dfs(grid, visited, i, j));
            }
        }
        return maxFish;
    }
    private int dfs(int[][] grid, boolean[][] visited, int i, int j) {
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || visited[i][j] ==true|| grid[i][j]==0)
            return 0;
        int total = grid[i][j];
        visited[i][j] =true;

        total+=dfs(grid, visited, i+1,j);
        total+=dfs(grid, visited, i, j+1);
        total+=dfs(grid, visited, i-1, j);
        total+=dfs(grid, visited, i, j-1);

        return total;
    }
}
