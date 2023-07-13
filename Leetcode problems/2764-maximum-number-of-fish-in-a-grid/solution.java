class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish =0;
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];

        for(int i =0;i<row;i++) {
            for(int j =0;j<col;j++) {
                if(!visited[i][j]&& grid[i][j]>0) 
                    maxFish = Math.max(maxFish, dfs(grid, i , j, visited));

            }
        }  
        return maxFish;
    }
    private int dfs(int[][] grid, int i, int j, boolean[][] visited) {
        if(i<0|| j<0|| i>= grid.length|| j>= grid[0].length|| visited[i][j]|| grid[i][j]==0)
        return 0;
        visited[i][j]= true;
        int total = grid[i][j];

        total+= dfs(grid, i-1,j, visited);
        total+= dfs(grid, i, j-1, visited);
        total+= dfs(grid, i+1, j, visited);
        total+= dfs(grid, i, j+1, visited);

        return total;
    }
}
