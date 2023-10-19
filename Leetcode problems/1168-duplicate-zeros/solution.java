class Solution {
    public void duplicateZeros(int[] arr) {
       int length=arr.length;
       int zeros=0;
       for(int i=0;i<length;i++)
       {
           if(arr[i]==0)
            zeros++;
       }
       int lastindex=length-1;
       int newindex=length-1+zeros;
       while(lastindex>=0)
       {
           if(newindex<length)
           {
               arr[newindex]=arr[lastindex];
           }
           if(arr[lastindex]==0){
               newindex--;
            if(newindex<length)
            arr[newindex]=0;
           }
           newindex--;
           lastindex--;
       }
    }
}
