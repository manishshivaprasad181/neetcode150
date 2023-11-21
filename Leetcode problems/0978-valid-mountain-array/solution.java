class Solution {
    public boolean validMountainArray(int[] arr) {
        int len=arr.length;
        int i=0;
        int j=len-1;
        while(i<len-1 && arr[i]<arr[i+1])i++;
        while(j>0 && arr[j]<arr[j-1])j--;
        return(i<len-1 && j>0 && i==j);

    }
}
