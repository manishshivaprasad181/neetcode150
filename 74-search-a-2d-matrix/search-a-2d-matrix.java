class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int m=matrix.length;
      int n=matrix[0].length;
      if(m==0)
      return false;
      int right=m*n-1;
      int left=0;
     while(left<=right)
     {
         int mid=(left+right)/2;
         if(target==matrix[mid/n][mid%n])
         {
             return true;
         }
         else
         {
             if(target<matrix[mid/n][mid%n])
             {
                 right=mid-1;
             }
             else
             {
                 left=mid+1;
             }
         }
     }
     return false; 

    }
}