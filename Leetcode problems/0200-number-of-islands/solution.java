class Solution {
    public void dfs(char[][] grid, int i, int j) {
        int nC = grid[0].length;
        int nR = grid.length;

        if(i<0|| i>=nR|| j<0||j>=nC|| grid[i][j]=='0')
            return;

        grid[i][j] ='0';
        dfs(grid, i+1,j);
        dfs(grid, i-1,j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
    public int numIslands(char[][] grid) {
        int numCols = grid[0].length;
        int numRows = grid.length;

        int numofIslands =0;
        for(int i=0;i<numRows;i++) {
            for(int j=0;j<numCols;j++) {
                if(grid[i][j]=='1') {
                    ++numofIslands;
                    dfs(grid, i, j);
                }
            }
        }
        return numofIslands;
    }
}
