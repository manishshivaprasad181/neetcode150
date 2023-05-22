class Solution {
    private char[][] board;
    private int rows;
    private int cols;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.rows = board.length;
        this.cols = board[0].length;

        for(int i =0;i<rows;i++) {
            for(int j =0;j<cols;j++) {
                if(backtrack(i, j, word,0))
                    return true; 
            
            }

        }
        return false;   
    }
        private boolean backtrack(int row, int col, String word, int index) {
            if(index>= word.length())
                return true;
            if(row<0||row>=rows||col<0||col>=cols||word.charAt(index)!=board[row][col]) 
            return false;
            boolean ret= false;
            this.board[row][col] ='#';
            int[] rowoffset = {0,1,-1,0};
            int[] coloffset = {1, 0,0,-1};
            for(int i =0;i<4;i++) {
                ret = backtrack(row+rowoffset[i], col+coloffset[i],word, index+1);
                if(ret)
                    break;
            }
            this.board[row][col] = word.charAt(index);
            return ret;
        }
}
