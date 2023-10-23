class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int n=arr.length-1;
        while(i<n && arr[i]<arr[i+1])i++;
        while(j>0 && arr[j]<arr[j-1])j--;
        return(i<n && i==j && j>0);
    }
}
