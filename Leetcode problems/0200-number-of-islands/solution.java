class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length==0) 
            return 0;
        
        int nR = grid.length;
        int nC = grid[0].length;
        int numIslands=0;
        for(int i = 0;i< nR; i++) {
            for(int j =0; j< nC; j++) {
                if(grid[i][j]=='1') {
                ++numIslands;
                dfs(i, j , grid);
                }
            }
        }
        return numIslands;
    }
    private void dfs(int row, int col, char[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        
        if(row<0 || row>= nr|| col<0 || col>=nc|| grid[row][col]=='0')
            return;
        
        grid[row][col] ='0';
        dfs(row-1,col, grid);
        dfs(row, col-1, grid);
        dfs(row+1, col, grid);
        dfs(row, col+1, grid);
    }
}
