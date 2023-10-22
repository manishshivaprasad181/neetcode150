class Solution {
    public void duplicateZeros(int[] arr) {
       int n=arr.length;
        int zeros=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                zeros++;
        }
      int lastindex=n-1;
        int newindex=n-1+zeros;
        while(lastindex>=0)
        {
            if(newindex<n){
                arr[newindex]=arr[lastindex];
            }
            if(arr[lastindex]==0){
                newindex--;
            if(newindex<n)
                arr[newindex]=0;
            }
            lastindex--;
            newindex--;
        }
    }
}
