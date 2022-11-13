class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    private int numRows;
    private int  numCols;
    private int[][] landheights;
  
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        if(heights.length == 0 || heights[0].length ==0)
            return new ArrayList<>();
        
        numRows = heights.length;
        numCols = heights[0].length;
        landheights = heights;
        boolean[][] pacificReachable = new boolean[numRows][numCols];
        boolean[][] atlanticReachable = new boolean[numRows][numCols];
        for(int i =0;i<numRows; i++) {
            dfs(i, 0, pacificReachable);
            dfs(i, numCols-1, atlanticReachable);
        }
        
        for(int i= 0;i< numCols;i++) {
            dfs(0, i, pacificReachable);
            dfs(numRows-1, i , atlanticReachable);
        }
        List<List<Integer>> commoncells = new ArrayList<>();
        
        for(int i =0;i<numRows;i++) {
            for(int j =0;j<numCols; j++) {
                if(pacificReachable[i][j] && atlanticReachable[i][j]) 
                    commoncells.add(List.of(i,j));
            }
        }
        return commoncells;
    }
    private  void dfs(int row, int col, boolean[][] reachable) {
        reachable[row][col] = true;
        for(int[] dir: DIRECTIONS) {
            int newRow = row+ dir[0];
            int newCol = col + dir[1];
            
            if(newRow<0 || newRow>= numRows || newCol<0 || newCol>=numCols)
                continue;
            if(reachable[newRow][newCol])
                continue;
            if(landheights[newRow][newCol] < landheights[row][col])
                continue;
            dfs(newRow, newCol, reachable);
    
        }
    }
}
    
    

               
