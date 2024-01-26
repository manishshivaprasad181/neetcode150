class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m==0)
            return false;
        
        int low =0;
        int high = m*n-1;
        int midelement;
        while(low<=high) {
            int mid = (high+low)/2;
            midelement = matrix[mid/n][mid%n];
            if(midelement==target)
                return true;
            if(midelement<target)
                low= mid+1;
            else
                high = mid-1;
        }
        return false;
    }
}
