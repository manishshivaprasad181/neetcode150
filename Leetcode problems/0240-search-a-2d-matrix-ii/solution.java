class Solution {
    public boolean findTarget(int[][] matrix, int target, int start, boolean vertical) {
        int low = start;
        int high = vertical?matrix[0].length-1:matrix.length-1;

        while(high>=low) {
            int mid = (low+high)/2;
            if(vertical) {
                if(matrix[start][mid]<target)
                    low = mid+1;
                else if(matrix[start][mid]>target)
                    high = mid-1;
                else    
                    return true;
            } else {
                if(matrix[mid][start]<target) 
                    low = mid+1;
                else if(matrix[mid][start]>target)
                    high = mid-1;
                else    
                    return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix==null)
            return false;
        int Dia = Math.min(matrix.length, matrix[0].length);

        for(int i=0;i<Dia;i++) {
            boolean verticalFound = findTarget(matrix, target, i, true);
            boolean horizontalFound = findTarget(matrix, target, i, false);
            if(verticalFound||horizontalFound)
                return true;
        }
        return false;
        
    }
}
