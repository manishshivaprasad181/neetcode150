class Solution {
    void dfs(char[][] grid, int row, int col) {
        int nr = grid.length;
        int nc = grid[0].length;

        if(row<0||col<0||row>=nr||col>=nc||grid[row][col]=='0') {
            return;
        }
        grid[row][col]='0';
        dfs(grid, row+1, col);
        dfs(grid, row, col+1);
        dfs(grid, row-1, col);
        dfs(grid, row, col-1);
    }
    public int numIslands(char[][] grid) {
        if(grid==null)
            return 0;
        int numofIslands =0;
        int nr = grid.length;
        int nc = grid[0].length;
        for(int r=0;r<nr;r++) {
            for(int c=0;c<nc;c++) {
                if(grid[r][c]=='1')
                {
                    ++numofIslands;
                    dfs(grid, r, c);
                }
                
            }
        }
        return numofIslands;
    }
}
