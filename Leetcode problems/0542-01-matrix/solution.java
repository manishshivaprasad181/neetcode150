class State {
    int row;
    int col;
    int steps;
    State(int row, int col, int steps) {
        this.row = row;
        this.col = col;
        this.steps = steps;
    }
}

class Solution {
    int m;
    int n;
    int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    

    public int[][] updateMatrix(int[][] mat) {
        m = mat.length;
        n = mat[0].length;
        int[][] matrix = new int[m][n];
        boolean[][] seen = new boolean[m][n];
        Queue<State> queue = new LinkedList<>();

        for(int row=0;row<m;row++) {
            for(int col=0;col<n;col++) {
                matrix[row][col] = mat[row][col];
                if(mat[row][col]==0) {
                    seen[row][col] = true;
                    queue.add(new State(row, col, 0));

                }
            }
        }
        while(!queue.isEmpty()) {
            State state = queue.remove();
            int row = state.row;
            int col = state.col;
            int steps = state.steps;

            for(int[] direction:directions) {
                int nextRow = row+direction[0];
                int nextCol = col+direction[1];

                if(nextRow>=0 && nextRow<m && nextCol>=0 && nextCol<n && !seen[nextRow][nextCol]) {
                    seen[nextRow][nextCol]=true;
                    queue.add(new State(nextRow, nextCol, steps+1));
                    matrix[nextRow][nextCol]= steps+1;
                } 
            }
        }
    return matrix;
    }
    
   
}
