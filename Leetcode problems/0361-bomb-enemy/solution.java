class Solution {
    public int maxKilledEnemies(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int maxCount =0;

        for(int i =0;i<rows;i++) {
            for(int j =0;j<cols;j++) {
                if(grid[i][j]=='0')   {
                    int hits = countKillEnemies(grid, i, j);
                    maxCount = Math.max(hits, maxCount);
                }
            }
        }
        return maxCount;
    }
    private int countKillEnemies(char[][] grid, int row, int col) {
        int maxEnemies=0;

        for(int c = col-1;c>=0;c--) {
            if(grid[row][c]=='W')
                break;
            if(grid[row][c]=='E')
                maxEnemies++;
        }
        for(int c =col+1;c<grid[0].length;c++) {
            if(grid[row][c]=='W')
                break;
            if(grid[row][c] =='E')
                maxEnemies++;
        }
        for(int r = row-1;r>=0;r--) {
            if(grid[r][col]=='W')
                break;
            if(grid[r][col]=='E')
                maxEnemies++;
        }
        for(int r=row+1;r<grid.length;r++) {
            if(grid[r][col]=='W')
                break;
            if(grid[r][col]=='E')
                maxEnemies++;
        }
        return maxEnemies;
    }
       
    
}
