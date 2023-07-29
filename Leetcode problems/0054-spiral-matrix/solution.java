class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> result = new ArrayList<>();
      int rows = matrix.length;
      int cols = matrix[0].length;
      int up =0;
      int left =0;
      int right = matrix[0].length-1;
      int down = matrix.length-1;

      while(result.size()<rows*cols) {
        for(int col =left;col<=right;col++)
          result.add(matrix[up][col]);
        for(int row = up+1;row<=down;row++) 
          result.add(matrix[row][right]);
        if(up!=down) {
            for(int col = right-1;col>=left;col--)
              result.add(matrix[down][col]);
        }
        if(left!=right) {
          for(int row= down-1;row>up;row--) 
            result.add(matrix[row][left]);
        }
        up++;
        down--;
        left++;
        right--;
      }
      return result;

    }
}
